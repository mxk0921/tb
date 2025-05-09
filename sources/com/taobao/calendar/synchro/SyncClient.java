package com.taobao.calendar.synchro;

import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.taobao.calendar.bridge.model.ScheduleDTOModule;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.eud;
import tb.fu2;
import tb.gud;
import tb.ju2;
import tb.t2o;
import tb.ts2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class SyncClient implements gud {
    static {
        t2o.a(693108789);
        t2o.a(693108788);
    }

    public void c(String str, String str2, eud eudVar) {
        CalendarCancelRequest calendarCancelRequest = new CalendarCancelRequest();
        calendarCancelRequest.bizId = str;
        calendarCancelRequest.outIds = str2;
        fu2.b(new IRemoteBaseListener() { // from class: com.taobao.calendar.synchro.SyncClient.2
            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
            }
        }, calendarCancelRequest);
    }

    public final List<ScheduleDTOModule> d(ScheduleDTOModule scheduleDTOModule) {
        ArrayList arrayList = new ArrayList();
        if (scheduleDTOModule == null) {
            return arrayList;
        }
        ArrayList arrayList2 = (ArrayList) ts2.c().d();
        if (arrayList2.isEmpty()) {
            arrayList.add(scheduleDTOModule);
            return arrayList;
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ScheduleDTOModule scheduleDTOModule2 = (ScheduleDTOModule) it.next();
            if (scheduleDTOModule2 != null && scheduleDTOModule2.getUpdate() == -1) {
                arrayList.add(scheduleDTOModule2);
            }
        }
        arrayList.add(scheduleDTOModule);
        return arrayList;
    }

    public final void e(List<ScheduleDTOModule> list) {
        if (!(list == null || list.isEmpty())) {
            for (ScheduleDTOModule scheduleDTOModule : list) {
                if (scheduleDTOModule != null) {
                    scheduleDTOModule.setUpdate(-1);
                }
            }
            ts2.c().g(list);
        }
    }

    public void f(final eud eudVar) {
        fu2.c(new IRemoteBaseListener() { // from class: com.taobao.calendar.synchro.SyncClient.3
            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                eud eudVar2 = eudVar;
                if (eudVar2 != null) {
                    ((ju2.c) eudVar2).a();
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                CalendarSyncAllResponse calendarSyncAllResponse = (CalendarSyncAllResponse) baseOutDo;
                eud eudVar2 = eudVar;
                if (eudVar2 != null) {
                    ((ju2.c) eudVar2).b(calendarSyncAllResponse);
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                eud eudVar2 = eudVar;
                if (eudVar2 != null) {
                    ((ju2.c) eudVar2).a();
                }
            }
        }, new CalendarSyncAllRequest());
    }

    public void g(final ScheduleDTOModule scheduleDTOModule, eud eudVar) {
        CalendarAddRequest calendarAddRequest = new CalendarAddRequest();
        calendarAddRequest.submitData = JSON.toJSONString(d(scheduleDTOModule));
        fu2.a(new IRemoteBaseListener() { // from class: com.taobao.calendar.synchro.SyncClient.1
            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                Log.e("SyncClient", "mtop query onSuccess");
                SyncClient syncClient = SyncClient.this;
                syncClient.e(syncClient.d(scheduleDTOModule));
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                Log.e("SyncClient", "mtop query onSuccess");
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                Log.e("SyncClient", "mtop query onSuccess");
                SyncClient syncClient = SyncClient.this;
                syncClient.e(syncClient.d(scheduleDTOModule));
            }
        }, calendarAddRequest);
    }
}
