package tb;

import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import anet.channel.session.dns.DnsNavConfigTask;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.channel.desktoplinktask.widgetservice.DesktopTaskServiceReceiver;
import com.taobao.login4android.api.Login;
import com.taobao.weex.common.Constants;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class oft {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MSG_FORMAT_DISPLAY_RECORD = 1;
    public static final int MSG_UPDATE_CONFIG = 4;
    public static final int MSG_UPDATE_DISPLAY_RECORD = 2;
    public static final int MSG_UPDATE_REQUEST_RECORD = 3;
    public static final int TRIGGER_TYPE_LOCAL = 2;
    public static final int TRIGGER_TYPE_ONCE = 1;

    /* renamed from: a  reason: collision with root package name */
    public Application f25363a;
    public Handler b;
    public long c;
    public volatile z7h d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final oft f25365a = new oft();

        static {
            t2o.a(435159096);
        }

        public static /* synthetic */ oft a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (oft) ipChange.ipc$dispatch("f8354478", new Object[0]);
            }
            return f25365a;
        }
    }

    static {
        t2o.a(435159094);
    }

    public static oft g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oft) ipChange.ipc$dispatch("1f1f34b3", new Object[0]);
        }
        return b.a();
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12a5fbf2", new Object[]{this});
            return;
        }
        Handler handler = this.b;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.b = null;
            yv8.a("TaskTrigger.CountDownTimer.cancelTimer.done", new Object[0]);
        }
    }

    public void f(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3847dd28", new Object[]{this, application});
            return;
        }
        this.f25363a = application;
        this.d = new z7h(application);
    }

    public final /* synthetic */ void k(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66493dd9", new Object[]{this, new Integer(i), str});
            return;
        }
        try {
            if (i == 1) {
                o(str);
            } else if (i == 2) {
                n(str);
            }
        } catch (Throwable th) {
            yv8.b("TaskTrigger.onNewData.error", th);
        }
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64ebb02f", new Object[]{this});
        } else {
            lst.a(new Runnable() { // from class: tb.mft
                @Override // java.lang.Runnable
                public final void run() {
                    oft.this.j();
                }
            });
        }
    }

    public void m(final int i, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bb5c56e", new Object[]{this, new Integer(i), str});
        } else {
            lst.a(new Runnable() { // from class: tb.lft
                @Override // java.lang.Runnable
                public final void run() {
                    oft.this.k(i, str);
                }
            });
        }
    }

    public final void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73dbf549", new Object[]{this, str});
            return;
        }
        p(str);
        l();
    }

    public final void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92b5098f", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            c5d c5dVar = new c5d(this.f25363a, DesktopTaskServiceReceiver.class);
            yv8.a("TaskTrigger.triggerOnceTask.newConfig=%s", str);
            Bundle bundle = new Bundle();
            bundle.putString("config", str);
            c5dVar.h(1, bundle, null);
        }
    }

    public final void p(String str) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75e53995", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            yv8.a("TaskTrigger.triggerLocalTask.newConfig=%s", str);
            Pair<String, JSONObject> d = this.d.d(str);
            Object obj = d.second;
            if (obj != null) {
                j = ((JSONObject) obj).getLongValue("indexId");
            } else {
                j = -1;
            }
            if (!TextUtils.isEmpty((CharSequence) d.first)) {
                abu.b(false, j);
                yv8.a("TaskTrigger.triggerLocalTask.stopOldTimer.", new Object[0]);
                return;
            }
            d();
            yv8.a("TaskTrigger.triggerLocalTask.stopOldTimer.", new Object[0]);
            this.d.r(str);
            abu.b(true, j);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final z7h f25364a;

        static {
            t2o.a(435159095);
        }

        public a(Looper looper, z7h z7hVar) {
            super(looper);
            this.f25364a = z7hVar;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/desktop/channel/desktoplinktask/trigger/TaskTrigger$ReplyMessengerHandler");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            try {
                Bundle data = message.getData();
                int i = message.what;
                if (i == 1) {
                    this.f25364a.e();
                } else if (i == 2) {
                    this.f25364a.q(data.getString("bizCode"));
                } else if (i == 3) {
                    this.f25364a.s();
                } else if (i == 4) {
                    this.f25364a.r(data.getString("newConfig"));
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final boolean h(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("513279bd", new Object[]{this, jSONObject, jSONObject2})).booleanValue();
        }
        return System.currentTimeMillis() - (jSONObject2.getLongValue("lastTime") * 1000) < jSONObject.getLongValue(Constants.Name.INTERVAL) * 1000;
    }

    public final boolean i(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6b2be47", new Object[]{this, jSONObject, jSONObject2})).booleanValue();
        }
        return this.d.k(jSONObject2.getLongValue("lastTime") * 1000) && jSONObject2.getIntValue(com.taobao.accs.common.Constants.KEY_TIMES) >= jSONObject.getIntValue(com.taobao.accs.common.Constants.KEY_TIMES);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0043 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:6:0x0012, B:8:0x001a, B:14:0x0026, B:17:0x002f, B:22:0x0043, B:24:0x0047, B:26:0x0056, B:27:0x0061), top: B:30:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:6:0x0012, B:8:0x001a, B:14:0x0026, B:17:0x002f, B:22:0x0043, B:24:0x0047, B:26:0x0056, B:27:0x0061), top: B:30:0x0012 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void j() {
        /*
            r10 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = tb.oft.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0012
            java.lang.String r3 = "b8769405"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r10
            r2.ipc$dispatch(r3, r1)
            return
        L_0x0012:
            android.util.Pair r2 = r10.e()     // Catch: all -> 0x0023
            java.lang.Object r3 = r2.first     // Catch: all -> 0x0023
            if (r3 == 0) goto L_0x0025
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: all -> 0x0023
            boolean r3 = r3.booleanValue()     // Catch: all -> 0x0023
            if (r3 != 0) goto L_0x0026
            goto L_0x0025
        L_0x0023:
            r0 = move-exception
            goto L_0x006e
        L_0x0025:
            r0 = 1
        L_0x0026:
            java.lang.Object r2 = r2.second     // Catch: all -> 0x0023
            com.alibaba.fastjson.JSONObject r2 = (com.alibaba.fastjson.JSONObject) r2     // Catch: all -> 0x0023
            r3 = 1000(0x3e8, double:4.94E-321)
            if (r2 != 0) goto L_0x002f
            goto L_0x0041
        L_0x002f:
            java.lang.String r5 = "endTime"
            long r5 = r2.getLongValue(r5)     // Catch: all -> 0x0023
            long r5 = r5 * r3
            long r7 = java.lang.System.currentTimeMillis()     // Catch: all -> 0x0023
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 >= 0) goto L_0x0040
            goto L_0x0041
        L_0x0040:
            r1 = r0
        L_0x0041:
            if (r1 == 0) goto L_0x0047
            r10.d()     // Catch: all -> 0x0023
            return
        L_0x0047:
            java.lang.String r0 = "loopInterval"
            long r0 = r2.getLongValue(r0)     // Catch: all -> 0x0023
            long r0 = r0 * r3
            r10.c = r0     // Catch: all -> 0x0023
            android.os.Handler r0 = r10.b     // Catch: all -> 0x0023
            if (r0 != 0) goto L_0x0061
            android.os.Handler r0 = new android.os.Handler     // Catch: all -> 0x0023
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch: all -> 0x0023
            r0.<init>(r1)     // Catch: all -> 0x0023
            r10.b = r0     // Catch: all -> 0x0023
        L_0x0061:
            android.os.Handler r0 = r10.b     // Catch: all -> 0x0023
            tb.nft r1 = new tb.nft     // Catch: all -> 0x0023
            r1.<init>()     // Catch: all -> 0x0023
            long r2 = r10.c     // Catch: all -> 0x0023
            r0.postDelayed(r1, r2)     // Catch: all -> 0x0023
            goto L_0x0073
        L_0x006e:
            java.lang.String r1 = "TaskTrigger.tickTimer.error"
            tb.yv8.b(r1, r0)
        L_0x0073:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.oft.j():void");
    }

    public final Pair<Boolean, JSONObject> e() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("c605ec96", new Object[]{this});
        }
        JSONObject f = this.d.f();
        agu aguVar = new agu(2);
        aguVar.d = new JSONObject();
        String string = f.getString("abBucketId");
        String string2 = f.getString(DnsNavConfigTask.MatchKey);
        aguVar.d.put("abBucketId", (Object) string);
        aguVar.d.put(DnsNavConfigTask.MatchKey, (Object) string2);
        if (!f.getBooleanValue("enable")) {
            abu.e(2, aguVar.c, aguVar.d, "start", "NotEnable", "");
            return new Pair<>(Boolean.FALSE, null);
        }
        JSONArray jSONArray = f.getJSONArray("triggers");
        if (jSONArray == null) {
            abu.e(2, aguVar.c, aguVar.d, "start", "noTriggerConfig", "");
            return new Pair<>(Boolean.FALSE, null);
        }
        int size = jSONArray.size();
        int i = 0;
        while (true) {
            if (i < size) {
                jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject != null && "loop".equals(jSONObject.getString("type"))) {
                    break;
                }
                i++;
            } else {
                jSONObject = null;
                break;
            }
        }
        if (jSONObject == null) {
            abu.e(aguVar.f15730a, aguVar.c, aguVar.d, "start", "noLoopTriggerConfig", "");
            return new Pair<>(Boolean.FALSE, null);
        }
        long currentTimeMillis = System.currentTimeMillis();
        long longValue = jSONObject.getLongValue("endTime") * 1000;
        long longValue2 = jSONObject.getLongValue("startTime") * 1000;
        if (currentTimeMillis >= longValue) {
            abu.e(aguVar.f15730a, aguVar.c, aguVar.d, "start", "reachEndTime", "");
            return new Pair<>(Boolean.FALSE, jSONObject);
        } else if (currentTimeMillis < longValue2) {
            abu.e(aguVar.f15730a, aguVar.c, aguVar.d, "start", "beforeStartTime", "");
            return new Pair<>(Boolean.TRUE, jSONObject);
        } else if (longValue - currentTimeMillis <= 0) {
            abu.e(aguVar.f15730a, aguVar.c, aguVar.d, "start", "noLeftTime", "");
            return new Pair<>(Boolean.FALSE, jSONObject);
        } else if (jSONObject.getLongValue("loopInterval") * 1000 <= 0) {
            abu.e(aguVar.f15730a, aguVar.c, aguVar.d, "start", "intervalTimeInvalid", "");
            return new Pair<>(Boolean.FALSE, jSONObject);
        } else {
            JSONObject g = this.d.g();
            yv8.a("TaskTrigger.startPopFloatWindow.localConfig.recordString=%s", g);
            if (g != null && !g.isEmpty()) {
                JSONObject jSONObject4 = f.getJSONObject("requestFatigue");
                if (!(jSONObject4 == null || (jSONObject3 = g.getJSONObject("requestFatigue")) == null)) {
                    if (i(jSONObject4, jSONObject3)) {
                        abu.e(aguVar.f15730a, aguVar.c, aguVar.d, "start", "requestFatigueReachMaxTimes", "");
                        return new Pair<>(Boolean.FALSE, jSONObject);
                    } else if (h(jSONObject4, jSONObject3)) {
                        abu.e(aguVar.f15730a, aguVar.c, aguVar.d, "start", "requestFatigueInInterval", "");
                        return new Pair<>(Boolean.TRUE, jSONObject);
                    }
                }
                JSONObject jSONObject5 = f.getJSONObject("displayFatigue");
                if (!(jSONObject5 == null || (jSONObject2 = g.getJSONObject("displayFatigue")) == null)) {
                    if (i(jSONObject5, jSONObject2)) {
                        abu.e(aguVar.f15730a, aguVar.c, aguVar.d, "start", "displayFatigueReachMaxTimes", "");
                        return new Pair<>(Boolean.FALSE, jSONObject);
                    } else if (h(jSONObject5, jSONObject2)) {
                        abu.e(aguVar.f15730a, aguVar.c, aguVar.d, "start", "displayFatigueInInterval", "");
                        return new Pair<>(Boolean.TRUE, jSONObject);
                    }
                }
            }
            c5d c5dVar = new c5d(this.f25363a, DesktopTaskServiceReceiver.class);
            Bundle bundle = new Bundle();
            bundle.putString("abBucketId", string);
            bundle.putString(DnsNavConfigTask.MatchKey, string2);
            bundle.putString("config", f.toJSONString());
            String str = "";
            bundle.putString("record", g != null ? g.toJSONString() : str);
            String userId = Login.getUserId();
            if (!TextUtils.isEmpty(userId)) {
                str = userId;
            }
            bundle.putString("uid", str);
            c5dVar.h(2, bundle, new a(Looper.getMainLooper(), this.d));
            return new Pair<>(Boolean.TRUE, jSONObject);
        }
    }
}
