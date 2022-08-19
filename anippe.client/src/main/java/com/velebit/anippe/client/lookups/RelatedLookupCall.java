package com.velebit.anippe.client.lookups;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.scout.rt.platform.text.TEXTS;
import org.eclipse.scout.rt.platform.util.CollectionUtility;
import org.eclipse.scout.rt.shared.services.lookup.ILookupRow;
import org.eclipse.scout.rt.shared.services.lookup.LocalLookupCall;
import org.eclipse.scout.rt.shared.services.lookup.LookupRow;

import com.velebit.anippe.shared.FontIcons;
import com.velebit.anippe.shared.constants.Constants;

public class RelatedLookupCall extends LocalLookupCall<Integer> {

	private static final long serialVersionUID = 1L;

	private List<Integer> onlyIds = CollectionUtility.arrayList();

	public List<Integer> getOnlyIds() {
		return onlyIds;
	}

	public void setOnlyIds(List<Integer> onlyIds) {
		this.onlyIds = onlyIds;
	}

	@Override
	protected List<? extends ILookupRow<Integer>> execCreateLookupRows() {

		List<ILookupRow<Integer>> rows = new ArrayList<ILookupRow<Integer>>();

		for (ILookupRow<Integer> row : availableRows()) {

			if (!CollectionUtility.isEmpty(getOnlyIds())) {
				if (!getOnlyIds().contains(row.getKey().intValue()))
					continue;

			}

			rows.add(row);

		}

		return rows;
	}

	private List<ILookupRow<Integer>> availableRows() {
		List<ILookupRow<Integer>> rows = new ArrayList<ILookupRow<Integer>>();

		rows.add(new LookupRow<Integer>(Constants.Related.USER, TEXTS.get("Users")).withIconId(FontIcons.PersonSolid));
		rows.add(new LookupRow<Integer>(Constants.Related.ROLE, TEXTS.get("Roles")).withIconId(FontIcons.Key));
		rows.add(new LookupRow<Integer>(Constants.Related.TASK, TEXTS.get("Tasks")).withIconId(FontIcons.Tasks));

		return rows;
	}

}
