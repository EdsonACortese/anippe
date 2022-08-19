package com.velebit.anippe.server.work;

import java.util.List;

import org.eclipse.scout.rt.shared.services.lookup.ILookupRow;
import org.eclipse.scout.rt.testing.platform.runner.RunWithSubject;
import org.eclipse.scout.rt.testing.server.runner.RunWithServerSession;
import org.eclipse.scout.rt.testing.server.runner.ServerTestRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.velebit.anippe.server.ServerSession;
import com.velebit.anippe.shared.work.UserLookupCall;

@RunWithSubject("anonymous")
@RunWith(ServerTestRunner.class)
@RunWithServerSession(ServerSession.class)
public class UserLookupCallTest {
	// TODO [Luka] add test cases

	protected UserLookupCall createLookupCall() {
		return new UserLookupCall();
	}

	@Test
	public void testGetDataByAll() {
		UserLookupCall call = createLookupCall();
		// TODO [Luka] fill call
		List<? extends ILookupRow<Long>> data = call.getDataByAll();
		// TODO [Luka] verify data
	}

	@Test
	public void testGetDataByKey() {
		UserLookupCall call = createLookupCall();
		// TODO [Luka] fill call
		List<? extends ILookupRow<Long>> data = call.getDataByKey();
		// TODO [Luka] verify data
	}

	@Test
	public void testGetDataByText() {
		UserLookupCall call = createLookupCall();
		// TODO [Luka] fill call
		List<? extends ILookupRow<Long>> data = call.getDataByText();
		// TODO [Luka] verify data
	}
}
