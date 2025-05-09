package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.taobao.calendar.bridge.model.ScheduleDTOModule;
import com.taobao.calendar.exception.CalendarResult;
import com.taobao.calendar.synchro.CalendarSyncAllResponse;
import com.taobao.calendar.synchro.SyncClient;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ju2 {

    /* renamed from: a  reason: collision with root package name */
    public final tkb f22217a;
    public final gud b = new SyncClient();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends ned {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ScheduleDTOModule f22218a;
        public final /* synthetic */ ned b;

        public a(ScheduleDTOModule scheduleDTOModule, ned nedVar) {
            this.f22218a = scheduleDTOModule;
            this.b = nedVar;
        }

        @Override // tb.ned
        public void a(CalendarResult calendarResult, String str) {
            CalendarResult calendarResult2 = CalendarResult.KTCALENDAR_SUCCESS;
            ned nedVar = this.b;
            if (calendarResult == calendarResult2) {
                ts2 c = ts2.c();
                ScheduleDTOModule scheduleDTOModule = this.f22218a;
                c.f(scheduleDTOModule);
                ((SyncClient) ju2.this.b).g(scheduleDTOModule, null);
                nedVar.a(calendarResult, str);
                return;
            }
            nedVar.a(calendarResult, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b extends ned {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f22219a;
        public final /* synthetic */ String b;
        public final /* synthetic */ ned c;

        public b(String str, String str2, ned nedVar) {
            this.f22219a = str;
            this.b = str2;
            this.c = nedVar;
        }

        @Override // tb.ned
        public void a(CalendarResult calendarResult, String str) {
            CalendarResult calendarResult2 = CalendarResult.KTCALENDAR_SUCCESS;
            ned nedVar = this.c;
            if (calendarResult == calendarResult2) {
                String str2 = this.f22219a;
                String str3 = this.b;
                ((SyncClient) ju2.this.b).c(str2, str3, null);
                ts2.c().h(str2, str3);
                nedVar.a(calendarResult, str);
                return;
            }
            nedVar.a(calendarResult, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements eud {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f22220a;
        public final /* synthetic */ ned b;

        public c(String str, ned nedVar) {
            this.f22220a = str;
            this.b = nedVar;
        }

        public void a() {
            ju2.this.d(this.f22220a, this.b);
        }

        public void b(Object obj) {
            if (obj != null) {
                CalendarSyncAllResponse calendarSyncAllResponse = (CalendarSyncAllResponse) obj;
                if (calendarSyncAllResponse.getData() != null) {
                    ts2.c().g(calendarSyncAllResponse.getData().result);
                    ju2.this.d(this.f22220a, this.b);
                    ts2.c().i(true);
                }
            }
        }
    }

    static {
        t2o.a(693108741);
    }

    public ju2(Context context) {
        this.f22217a = new t2r(context);
    }

    public void b(ScheduleDTOModule scheduleDTOModule, ned nedVar) {
        if (scheduleDTOModule == null || TextUtils.isEmpty(scheduleDTOModule.getBizId()) || TextUtils.isEmpty(scheduleDTOModule.getOutId())) {
            nedVar.a(CalendarResult.KTCALENDAR_INVALID_PARAM, null);
        } else if (ts2.c().a(scheduleDTOModule.getBizId(), scheduleDTOModule.getOutId())) {
            nedVar.a(CalendarResult.kTBCALENDAR_REMINDER_EXISTS, null);
        } else {
            ((t2r) this.f22217a).b(scheduleDTOModule, new a(scheduleDTOModule, nedVar));
        }
    }

    public void c(String str, String str2, ned nedVar) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            nedVar.a(CalendarResult.KTCALENDAR_INVALID_PARAM, null);
        }
        ((t2r) this.f22217a).c(str, str2, new b(str, str2, nedVar));
    }

    public void e(String str, ned nedVar) {
        if (!ts2.c().e()) {
            ((SyncClient) this.b).f(new c(str, nedVar));
            return;
        }
        d(str, nedVar);
    }

    public final void d(String str, ned nedVar) {
        JSONObject jSONObject;
        if (!(nedVar == null || str == null)) {
            JSONObject parseObject = JSON.parseObject(str);
            if (parseObject == null) {
                nedVar.a(CalendarResult.KTCALENDAR_INVALID_PARAM, null);
                return;
            }
            JSONArray jSONArray = parseObject.getJSONArray("calendarPlanList");
            if (jSONArray == null || jSONArray.isEmpty()) {
                nedVar.a(CalendarResult.KTCALENDAR_INVALID_PARAM, null);
                return;
            }
            JSONArray jSONArray2 = new JSONArray();
            for (int i = 0; i < jSONArray.size() && (jSONObject = (JSONObject) jSONArray.get(i)) != null; i++) {
                if (ts2.c().a(jSONObject.getString("bizId"), jSONObject.getString("outId"))) {
                    jSONArray2.add(jSONObject);
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("result", (Object) jSONArray2);
            nedVar.a(CalendarResult.KTCALENDAR_SUCCESS, jSONObject2.toJSONString());
        }
    }
}
