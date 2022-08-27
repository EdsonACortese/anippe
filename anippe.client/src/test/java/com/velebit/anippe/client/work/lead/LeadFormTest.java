package com.velebit.anippe.client.work.lead;

import org.eclipse.scout.rt.client.testenvironment.TestEnvironmentClientSession;
import org.eclipse.scout.rt.testing.client.runner.ClientTestRunner;
import org.eclipse.scout.rt.testing.client.runner.RunWithClientSession;
import org.eclipse.scout.rt.testing.platform.mock.BeanMock;
import org.eclipse.scout.rt.testing.platform.runner.RunWithSubject;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;

import com.velebit.anippe.shared.work.lead.ILeadService;
import com.velebit.anippe.shared.work.lead.LeadFormData;

@RunWithSubject("anonymous")
@RunWith(ClientTestRunner.class)
@RunWithClientSession(TestEnvironmentClientSession.class)
public class LeadFormTest {
	@BeanMock
	private ILeadService m_mockSvc;
	// TODO [Luka] add test cases

	@Before
	public void setup() {
		LeadFormData answer = new LeadFormData();
		Mockito.when(m_mockSvc.prepareCreate(ArgumentMatchers.any())).thenReturn(answer);
		Mockito.when(m_mockSvc.create(ArgumentMatchers.any())).thenReturn(answer);
		Mockito.when(m_mockSvc.load(ArgumentMatchers.any())).thenReturn(answer);
		Mockito.when(m_mockSvc.store(ArgumentMatchers.any())).thenReturn(answer);
	}
}
