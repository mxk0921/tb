package tb;

import com.taobao.calendar.synchro.CalendarAddOrCancelResponse;
import com.taobao.calendar.synchro.CalendarAddRequest;
import com.taobao.calendar.synchro.CalendarCancelRequest;
import com.taobao.calendar.synchro.CalendarSyncAllRequest;
import com.taobao.calendar.synchro.CalendarSyncAllResponse;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.tao.util.TaoHelper;
import mtopsdk.mtop.domain.IMTOPDataObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class fu2 {
    static {
        t2o.a(693108779);
    }

    public static void a(IRemoteListener iRemoteListener, CalendarAddRequest calendarAddRequest) {
        RemoteBusiness registeListener = RemoteBusiness.build((IMTOPDataObject) calendarAddRequest, TaoHelper.getTTID()).registeListener(iRemoteListener);
        registeListener.setErrorNotifyAfterCache(false);
        registeListener.startRequest(CalendarAddOrCancelResponse.class);
    }

    public static void b(IRemoteListener iRemoteListener, CalendarCancelRequest calendarCancelRequest) {
        RemoteBusiness registeListener = RemoteBusiness.build((IMTOPDataObject) calendarCancelRequest, TaoHelper.getTTID()).registeListener(iRemoteListener);
        registeListener.setErrorNotifyAfterCache(false);
        registeListener.startRequest(CalendarAddOrCancelResponse.class);
    }

    public static void c(IRemoteListener iRemoteListener, CalendarSyncAllRequest calendarSyncAllRequest) {
        RemoteBusiness registeListener = RemoteBusiness.build((IMTOPDataObject) calendarSyncAllRequest, TaoHelper.getTTID()).registeListener(iRemoteListener);
        registeListener.setErrorNotifyAfterCache(false);
        registeListener.startRequest(CalendarSyncAllResponse.class);
    }
}
