package com.velebit.anippe.client.project;

import org.eclipse.scout.rt.client.testenvironment.TestEnvironmentClientSession;
import org.eclipse.scout.rt.testing.client.runner.ClientTestRunner;
import org.eclipse.scout.rt.testing.client.runner.RunWithClientSession;
import org.eclipse.scout.rt.testing.platform.mock.BeanMock;
import org.eclipse.scout.rt.testing.platform.runner.RunWithSubject;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;

import com.velebit.anippe.shared.project.IProjectService;
import com.velebit.anippe.shared.project.ProjectFormData;

@RunWithSubject("anonymous")
@RunWith(ClientTestRunner.class)
@RunWithClientSession(TestEnvironmentClientSession.class)
public class ProjectFormTest {
	@BeanMock
	private IProjectService m_mockSvc;
	// TODO [Luka] add test cases

	@Before
	public void setup() {
		ProjectFormData answer = new ProjectFormData();
		Mockito.when(m_mockSvc.prepareCreate(ArgumentMatchers.any())).thenReturn(answer);
		Mockito.when(m_mockSvc.create(ArgumentMatchers.any())).thenReturn(answer);
		Mockito.when(m_mockSvc.load(ArgumentMatchers.any())).thenReturn(answer);
		Mockito.when(m_mockSvc.store(ArgumentMatchers.any())).thenReturn(answer);
	}
}
