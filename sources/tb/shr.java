package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class shr extends m8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long TBLCACHE = -2712665586039606850L;
    public static volatile Object b = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends Coordinator.TaggedRunnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ u8 f28060a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, u8 u8Var, String str2) {
            super(str);
            this.f28060a = u8Var;
            this.b = str2;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/dinamicx/TBLCacheAbility$1");
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.f28060a != null) {
                Object b = nwg.b(this.b);
                JSONObject jSONObject = new JSONObject();
                if (b != null) {
                    jSONObject.put("value", b);
                }
                this.f28060a.callback("success", new f8(jSONObject));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class c implements w8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(310378561);
            t2o.a(336592930);
        }

        /* renamed from: a */
        public shr build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (shr) ipChange.ipc$dispatch("dc3f7387", new Object[]{this, obj});
            }
            return new shr();
        }
    }

    static {
        t2o.a(310378558);
    }

    public static /* synthetic */ Object ipc$super(shr shrVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/dinamicx/TBLCacheAbility");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0126  */
    @Override // tb.m8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tb.c8 f(tb.n8 r10, tb.k8 r11, tb.u8 r12) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.shr.f(tb.n8, tb.k8, tb.u8):tb.c8");
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b extends Coordinator.TaggedRunnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ u8 f28061a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Object c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, u8 u8Var, String str2, Object obj) {
            super(str);
            this.f28061a = u8Var;
            this.b = str2;
            this.c = obj;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/dinamicx/TBLCacheAbility$2");
        }

        @Override // java.lang.Runnable
        public void run() {
            int indexOf;
            JSONObject jSONObject;
            JSONArray jSONArray;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.f28061a != null) {
                if (nvs.N() && this.b.equals("kTBLiveFeedListKey_2024_new")) {
                    Object obj = this.c;
                    if (obj instanceof JSONObject) {
                        JSONObject parseObject = JSON.parseObject(JSON.toJSONString(obj));
                        JSONObject jSONObject2 = parseObject.getJSONObject("data");
                        JSONArray jSONArray2 = new JSONArray();
                        if (jSONObject2 != null) {
                            JSONArray jSONArray3 = jSONObject2.getJSONArray("cardList");
                            if (jSONArray3 != null && jSONArray3.size() == 3) {
                                JSONObject jSONObject3 = jSONArray3.getJSONObject(0);
                                JSONObject jSONObject4 = new JSONObject(jSONObject3);
                                boolean z = (qw0.a() && nvs.Y()) || (qw0.b() && nvs.Z());
                                if (jSONObject3 != null && z) {
                                    jSONObject4.put("cardTypes", (Object) null);
                                    jSONObject3.put("cardData", (Object) null);
                                    jSONObject3.put("background", "");
                                } else if (jSONObject3 != null && nvs.d0()) {
                                    JSONArray jSONArray4 = jSONObject3.getJSONArray("cardTypes");
                                    JSONArray jSONArray5 = jSONObject3.getJSONArray("cardData");
                                    if (!(jSONArray4 == null || jSONArray5 == null || !jSONArray4.contains("liveSmartIsLandCard") || (jSONArray = (jSONObject = jSONArray5.getJSONObject((indexOf = jSONArray4.indexOf("liveSmartIsLandCard")))).getJSONArray("cardData")) == null || jSONArray.size() <= 3)) {
                                        for (int size = jSONArray.size() - 1; size > 2; size--) {
                                            jSONArray.remove(size);
                                        }
                                        jSONObject.put("cardData", (Object) jSONArray);
                                        jSONArray5.remove(indexOf);
                                        jSONArray5.add(indexOf, jSONObject);
                                        jSONObject3.put("cardData", (Object) jSONArray5);
                                    }
                                }
                                jSONArray2.add(jSONObject3);
                                jSONArray2.add(jSONArray3.getJSONObject(1));
                                JSONObject jSONObject5 = jSONArray3.getJSONObject(2);
                                int a0 = nvs.a0();
                                if (!(a0 == -1 || jSONObject5 == null)) {
                                    JSONArray jSONArray6 = jSONObject5.getJSONArray("cardData");
                                    JSONArray jSONArray7 = new JSONArray();
                                    if (jSONArray6 != null && jSONArray6.size() > a0) {
                                        for (int i = 0; i < a0; i++) {
                                            jSONArray7.add(jSONArray6.get(i));
                                        }
                                        jSONArray6 = jSONArray7;
                                    }
                                    jSONObject5.put("cardData", (Object) jSONArray6);
                                }
                                jSONArray2.add(jSONObject5);
                                jSONObject2.put("cardList", (Object) jSONArray2);
                                jSONObject2.put("traceMap", new JSONObject());
                                parseObject.put("data", (Object) jSONObject2);
                                parseObject.put("akResponseHeader", new JSONObject());
                            }
                            nwg.d(this.b, parseObject);
                        }
                        this.f28061a.callback("success", new f8());
                    }
                }
                nwg.d(this.b, this.c);
                this.f28061a.callback("success", new f8());
            }
        }
    }
}
