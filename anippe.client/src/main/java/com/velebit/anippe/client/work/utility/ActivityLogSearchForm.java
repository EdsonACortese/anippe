package com.velebit.anippe.client.work.utility;

import java.util.Date;

import org.eclipse.scout.rt.client.dto.FormData;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.AbstractSearchForm;
import org.eclipse.scout.rt.client.ui.form.AbstractFormHandler;
import org.eclipse.scout.rt.client.ui.form.fields.button.AbstractResetButton;
import org.eclipse.scout.rt.client.ui.form.fields.button.AbstractSearchButton;
import org.eclipse.scout.rt.client.ui.form.fields.datefield.AbstractDateField;
import org.eclipse.scout.rt.client.ui.form.fields.groupbox.AbstractGroupBox;
import org.eclipse.scout.rt.client.ui.form.fields.sequencebox.AbstractSequenceBox;
import org.eclipse.scout.rt.client.ui.form.fields.smartfield.AbstractSmartField;
import org.eclipse.scout.rt.client.ui.form.fields.tabbox.AbstractTabBox;
import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.platform.text.TEXTS;
import org.eclipse.scout.rt.platform.util.date.DateUtility;
import org.eclipse.scout.rt.shared.services.lookup.ILookupCall;

import com.velebit.anippe.client.common.interaction.NotificationHelper;
import com.velebit.anippe.client.lookups.RelatedLookupCall;
import com.velebit.anippe.client.work.utility.ActivityLogSearchForm.MainBox.CancelButton;
import com.velebit.anippe.client.work.utility.ActivityLogSearchForm.MainBox.MainTabBox;
import com.velebit.anippe.client.work.utility.ActivityLogSearchForm.MainBox.OkButton;
import com.velebit.anippe.client.work.utility.ActivityLogSearchForm.MainBox.MainTabBox.SearchParametersBox;
import com.velebit.anippe.client.work.utility.ActivityLogSearchForm.MainBox.MainTabBox.SearchParametersBox.PeriodBox;
import com.velebit.anippe.client.work.utility.ActivityLogSearchForm.MainBox.MainTabBox.SearchParametersBox.RelatedField;
import com.velebit.anippe.client.work.utility.ActivityLogSearchForm.MainBox.MainTabBox.SearchParametersBox.UserField;
import com.velebit.anippe.client.work.utility.ActivityLogSearchForm.MainBox.MainTabBox.SearchParametersBox.PeriodBox.FromField;
import com.velebit.anippe.client.work.utility.ActivityLogSearchForm.MainBox.MainTabBox.SearchParametersBox.PeriodBox.ToField;
import com.velebit.anippe.shared.work.UserLookupCall;
import com.velebit.anippe.shared.work.utility.ActivityLogSearchFormData;

@FormData(value = ActivityLogSearchFormData.class, sdkCommand = FormData.SdkCommand.CREATE)
public class ActivityLogSearchForm extends AbstractSearchForm {
	@Override
	protected String getConfiguredTitle() {
		return TEXTS.get("Search");
	}

	public void startModify() {
		startInternalExclusive(new ModifyHandler());
	}

	public void startNew() {
		startInternal(new NewHandler());
	}

	public CancelButton getCancelButton() {
		return getFieldByClass(CancelButton.class);
	}

	public FromField getFromField() {
		return getFieldByClass(FromField.class);
	}

	public MainBox getMainBox() {
		return getFieldByClass(MainBox.class);
	}

	public MainTabBox getMainTabBox() {
		return getFieldByClass(MainTabBox.class);
	}

	public OkButton getOkButton() {
		return getFieldByClass(OkButton.class);
	}

	public PeriodBox getPeriodBox() {
		return getFieldByClass(PeriodBox.class);
	}

	@Override
	protected boolean execValidate() {
		if (org.eclipse.scout.rt.platform.util.date.DateUtility.getDaysBetween(getFromField().getValue(), getToField().getValue()) > 5) {
			NotificationHelper.showWarningNotification(TEXTS.get("SearchPeriodIsTooBig"));
			return false;
		}

		return true;
	}

	public RelatedField getRelatedField() {
		return getFieldByClass(RelatedField.class);
	}

	public SearchParametersBox getSearchParametersBox() {
		return getFieldByClass(SearchParametersBox.class);
	}

	public ToField getToField() {
		return getFieldByClass(ToField.class);
	}

	public UserField getUserField() {
		return getFieldByClass(UserField.class);
	}

	@Order(1000)
	public class MainBox extends AbstractGroupBox {

		@Order(0)
		public class MainTabBox extends AbstractTabBox {

			@Order(1000)
			public class SearchParametersBox extends AbstractGroupBox {

				@Override
				protected int getConfiguredGridColumnCount() {
					return 3;
				}

				@Override
				protected String getConfiguredLabel() {
					return TEXTS.get("SearchParameters");
				}

				@Order(1000)
				public class PeriodBox extends AbstractSequenceBox {

					@Override
					protected boolean getConfiguredAutoCheckFromTo() {
						return false;
					}

					@Override
					public boolean isLabelVisible() {
						return false;
					}

					@Order(1000)
					public class FromField extends AbstractDateField {

						@Override
						protected String getConfiguredLabel() {
							return TEXTS.get("PeriodFrom");
						}

						@Override
						protected void execInitField() {
							setValue(DateUtility.min(new Date()));
						}
					}

					@Order(2000)
					public class ToField extends AbstractDateField {

						@Override
						protected String getConfiguredLabel() {
							return TEXTS.get("to");
						}

						@Override
						protected void execInitField() {
							setValue(DateUtility.max(new Date()));
						}
					}
				}

				@Order(1000)
				public class RelatedField extends AbstractSmartField<Integer> {

					@Override
					protected String getConfiguredLabel() {
						return TEXTS.get("Module");
					}

					@Override
					protected int getConfiguredLabelWidthInPixel() {
						return 70;
					}

					@Override
					protected Class<? extends ILookupCall<Integer>> getConfiguredLookupCall() {
						return RelatedLookupCall.class;
					}
				}

				@Order(2000)
				public class UserField extends AbstractSmartField<Long> {

					@Override
					protected String getConfiguredLabel() {
						return TEXTS.get("User");
					}

					@Override
					protected int getConfiguredLabelWidthInPixel() {
						return 70;
					}

					@Override
					protected Class<? extends ILookupCall<Long>> getConfiguredLookupCall() {
						return UserLookupCall.class;
					}
				}
			}
		}

		@Order(100000)
		public class OkButton extends AbstractSearchButton {
		}

		@Order(101000)
		public class CancelButton extends AbstractResetButton {
		}
	}

	public class NewHandler extends AbstractFormHandler {
		@Override
		protected void execLoad() {
		}

		@Override
		protected void execStore() {
		}
	}

	public class ModifyHandler extends AbstractFormHandler {
		@Override
		protected void execLoad() {
		}

		@Override
		protected void execStore() {
		}
	}
}
