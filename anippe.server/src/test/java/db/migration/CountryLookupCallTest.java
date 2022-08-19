package db.migration;

import org.eclipse.scout.rt.server.IServerSession;
import org.eclipse.scout.rt.shared.services.lookup.ILookupRow;
import org.eclipse.scout.rt.testing.platform.runner.RunWithSubject;
import org.eclipse.scout.rt.testing.server.runner.RunWithServerSession;
import org.eclipse.scout.rt.testing.server.runner.ServerTestRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;

@RunWithSubject("anonymous")
@RunWith(ServerTestRunner.class)
@RunWithServerSession(IServerSession.class)
public class CountryLookupCallTest {
// TODO [Luka] add test cases

    protected CountryLookupCall createLookupCall() {
        return new CountryLookupCall();
    }

    @Test
    public void testGetDataByAll() {
        CountryLookupCall call = createLookupCall();
// TODO [Luka] fill call
        List<? extends ILookupRow<Long>> data = call.getDataByAll();
// TODO [Luka] verify data
    }

    @Test
    public void testGetDataByKey() {
        CountryLookupCall call = createLookupCall();
// TODO [Luka] fill call
        List<? extends ILookupRow<Long>> data = call.getDataByKey();
// TODO [Luka] verify data
    }

    @Test
    public void testGetDataByText() {
        CountryLookupCall call = createLookupCall();
// TODO [Luka] fill call
        List<? extends ILookupRow<Long>> data = call.getDataByText();
// TODO [Luka] verify data
    }
}
