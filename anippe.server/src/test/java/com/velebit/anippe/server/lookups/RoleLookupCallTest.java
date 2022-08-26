package com.velebit.anippe.server.lookups;

import java.util.List;

import org.eclipse.scout.rt.shared.services.lookup.ILookupRow;
import org.eclipse.scout.rt.testing.platform.runner.RunWithSubject;
import org.eclipse.scout.rt.testing.server.runner.RunWithServerSession;
import org.eclipse.scout.rt.testing.server.runner.ServerTestRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.velebit.anippe.server.ServerSession;
import com.velebit.anippe.shared.lookups.RoleLookupCall;

@RunWithSubject("anonymous")
@RunWith(ServerTestRunner.class)
@RunWithServerSession(ServerSession.class)
public class RoleLookupCallTest {
	// TODO [Luka] add test cases

	protected RoleLookupCall createLookupCall() {
		return new RoleLookupCall();
	}

	@Test
	public void testGetDataByAll() {
		RoleLookupCall call = createLookupCall();
		// TODO [Luka] fill call
		List<? extends ILookupRow<Long>> data = call.getDataByAll();
		// TODO [Luka] verify data
	}

	@Test
	public void testGetDataByKey() {
		RoleLookupCall call = createLookupCall();
		// TODO [Luka] fill call
		List<? extends ILookupRow<Long>> data = call.getDataByKey();
		// TODO [Luka] verify data
	}

	@Test
	public void testGetDataByText() {
		RoleLookupCall call = createLookupCall();
		// TODO [Luka] fill call
		List<? extends ILookupRow<Long>> data = call.getDataByText();
		// TODO [Luka] verify data
	}
}
