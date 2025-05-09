package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;
import java.util.HashMap;
import java.util.Map;
import tb.mir;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class f4h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final k5h f18994a;
    public final FluidContext b;
    public final IMessageService c;
    public atb d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements htc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f18995a;

        public a(d dVar) {
            this.f18995a = dVar;
        }

        @Override // tb.htc
        public void a(vrp vrpVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("23678016", new Object[]{this, vrpVar});
            } else if (vrpVar != null && f4h.a(f4h.this).h0()) {
                ir9.b("LiveSharePlayerUtils", "LiveSharePlayer 卡片收到监听addNaviGoLiveRoomMsgListener,idwInstance：" + f4h.b(f4h.this));
                f4h.c(f4h.this, vrpVar.h, this.f18995a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements htc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(f4h f4hVar) {
        }

        @Override // tb.htc
        public void a(vrp vrpVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("23678016", new Object[]{this, vrpVar});
            } else {
                ir9.b("LiveSharePlayerUtils", "LiveSharePlayer 移除消息监听");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements mir.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(f4h f4hVar) {
        }

        @Override // tb.mir.a
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("355d78a6", new Object[]{this, str});
                return;
            }
            ir9.b("LiveSharePlayerUtils", "onReuse: " + str);
        }

        @Override // tb.mir.a
        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e98d95b9", new Object[]{this, str});
                return;
            }
            ir9.b("LiveSharePlayerUtils", "onRelease: " + str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface d {
        void l(jgi jgiVar, Bitmap bitmap);
    }

    static {
        t2o.a(468713971);
    }

    public f4h(k5h k5hVar) {
        this.f18994a = k5hVar;
        FluidContext U = k5hVar.U();
        this.b = U;
        if (U != null) {
            this.c = (IMessageService) U.getService(IMessageService.class);
        }
    }

    public static /* synthetic */ k5h a(f4h f4hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k5h) ipChange.ipc$dispatch("22988795", new Object[]{f4hVar});
        }
        return f4hVar.f18994a;
    }

    public static /* synthetic */ atb b(f4h f4hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (atb) ipChange.ipc$dispatch("93764944", new Object[]{f4hVar});
        }
        return f4hVar.d;
    }

    public static /* synthetic */ void c(f4h f4hVar, Map map, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88114a1e", new Object[]{f4hVar, map, dVar});
        } else {
            f4hVar.k(map, dVar);
        }
    }

    public static String e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ff48fee4", new Object[]{str, str2});
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return str;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(yj4.PARAM_PLAY_VIEW_TOKEN, str2);
        return nov.a(str, hashMap);
    }

    public static boolean f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("624f6d2c", new Object[]{new Boolean(z)})).booleanValue();
        }
        if (gbr.a() != 2 && g() && i() && !z) {
            return true;
        }
        return false;
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("669da35d", new Object[0])).booleanValue();
        }
        return akt.p2("ShortVideo.enableImmersiveLiveJumpV3", true);
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("662b2f38", new Object[0])).booleanValue();
        }
        boolean equals = TextUtils.equals("true", akt.G2("AB_fullscreenpage_video.immersive_live_jump.isSharePlayer", String.valueOf(true)));
        ir9.b("LiveSharePlayerUtils", "AB config enable:" + equals);
        return equals;
    }

    public static boolean j(FluidContext fluidContext) {
        IDataService iDataService;
        a.c J;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c78f5bee", new Object[]{fluidContext})).booleanValue();
        }
        if (fluidContext == null || (iDataService = (IDataService) fluidContext.getService(IDataService.class)) == null || iDataService.getCurrentMediaDetail() == null || (J = iDataService.getCurrentMediaDetail().J()) == null || !J.e()) {
            return false;
        }
        return true;
    }

    public void d(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55299b6d", new Object[]{this, dVar});
            return;
        }
        IMessageService iMessageService = this.c;
        if (iMessageService != null) {
            iMessageService.addMessageListener("VSMSG_navToLiveRoom", new a(dVar));
        }
    }

    public void h(FluidContext fluidContext, Context context, String str, Bundle bundle, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e468a3", new Object[]{this, fluidContext, context, str, bundle, dVar});
            return;
        }
        atb atbVar = this.d;
        if (atbVar == null) {
            ir9.b("LiveSharePlayerUtils", "idwInstance为null return");
            FluidSDK.getNavAdapter().nav(fluidContext, context, str, bundle);
        } else if (!(atbVar instanceof d5g) || !c5g.c("live") || !c5g.d("live")) {
            try {
                jgi x = this.d.x();
                String c2 = x != null ? x.c() : null;
                this.d.y();
                if (dVar != null) {
                    dVar.l(x, null);
                }
                String c3 = mir.b().c(context, c2, x, new c(this));
                if (TextUtils.isEmpty(c3)) {
                    ir9.b("LiveSharePlayerUtils", "playViewToken为null 正常跳转，mediaPlayViewProxy：" + x);
                    this.d.destroy();
                    FluidSDK.getNavAdapter().nav(fluidContext, context, str, bundle);
                    return;
                }
                String e = e(str, c3);
                ir9.b("LiveSharePlayerUtils", "跳转buildUrl: " + e);
                FluidSDK.getNavAdapter().navDisableTransition(fluidContext, context, e, bundle);
            } catch (Exception e2) {
                ir9.c("LiveSharePlayerUtils", "immersiveLiveJump异常" + e2.getMessage() + "\n", e2);
                this.d.destroy();
                FluidSDK.getNavAdapter().nav(fluidContext, context, str, bundle);
            }
        } else {
            ir9.b("LiveSharePlayerUtils", "KirinDWInstanceProxy标准化 沉浸式跳转 ");
            this.f18994a.r1();
            if (dVar != null) {
                dVar.l(null, this.d.h());
            }
            FluidSDK.getNavAdapter().navDisableTransition(fluidContext, context, str, bundle);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(java.util.Map r9, tb.f4h.d r10) {
        /*
            r8 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.f4h.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0018
            java.lang.String r1 = "d497c18a"
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r8
            r3 = 1
            r2[r3] = r9
            r9 = 2
            r2[r9] = r10
            r0.ipc$dispatch(r1, r2)
            return
        L_0x0018:
            java.lang.String r0 = "url"
            java.lang.Object r0 = r9.get(r0)
            r1 = 0
            java.lang.String r5 = tb.nwv.I(r0, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L_0x002b
            return
        L_0x002b:
            java.lang.String r0 = "nativeParams"
            java.lang.Object r9 = r9.get(r0)     // Catch: Exception -> 0x006a
            boolean r0 = r9 instanceof com.alibaba.fastjson.JSONObject     // Catch: Exception -> 0x006a
            if (r0 == 0) goto L_0x006c
            android.os.Bundle r0 = new android.os.Bundle     // Catch: Exception -> 0x006a
            r0.<init>()     // Catch: Exception -> 0x006a
            com.alibaba.fastjson.JSONObject r9 = (com.alibaba.fastjson.JSONObject) r9     // Catch: Exception -> 0x0065
            java.util.Set r9 = r9.entrySet()     // Catch: Exception -> 0x0065
            java.util.Iterator r9 = r9.iterator()     // Catch: Exception -> 0x0065
        L_0x0045:
            boolean r1 = r9.hasNext()     // Catch: Exception -> 0x0065
            if (r1 == 0) goto L_0x0068
            java.lang.Object r1 = r9.next()     // Catch: Exception -> 0x0065
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: Exception -> 0x0065
            java.lang.Object r2 = r1.getKey()     // Catch: Exception -> 0x0065
            java.lang.String r2 = (java.lang.String) r2     // Catch: Exception -> 0x0065
            java.lang.Object r1 = r1.getValue()     // Catch: Exception -> 0x0065
            if (r1 == 0) goto L_0x0045
            java.lang.String r1 = r1.toString()     // Catch: Exception -> 0x0065
            r0.putString(r2, r1)     // Catch: Exception -> 0x0065
            goto L_0x0045
        L_0x0065:
            r9 = move-exception
            r1 = r0
            goto L_0x006e
        L_0x0068:
            r1 = r0
            goto L_0x006c
        L_0x006a:
            r9 = move-exception
            goto L_0x006e
        L_0x006c:
            r6 = r1
            goto L_0x0087
        L_0x006e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "naviGoLiveRoom e="
            r0.<init>(r2)
            java.lang.String r9 = r9.getMessage()
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            java.lang.String r0 = "LiveSharePlayerUtils"
            tb.ir9.b(r0, r9)
            goto L_0x006c
        L_0x0087:
            com.taobao.android.fluid.core.FluidContext r9 = r8.b
            android.content.Context r4 = r9.getContext()
            com.taobao.android.fluid.core.FluidContext r9 = r8.b
            boolean r9 = j(r9)
            boolean r9 = f(r9)
            if (r9 != 0) goto L_0x00a3
            com.taobao.android.fluid.framework.adapter.INavAdapter r9 = com.taobao.android.fluid.FluidSDK.getNavAdapter()
            com.taobao.android.fluid.core.FluidContext r10 = r8.b
            r9.nav(r10, r4, r5, r6)
            return
        L_0x00a3:
            com.taobao.android.fluid.core.FluidContext r3 = r8.b
            r2 = r8
            r7 = r10
            r2.h(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.f4h.k(java.util.Map, tb.f4h$d):void");
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e403543", new Object[]{this});
            return;
        }
        IMessageService iMessageService = this.c;
        if (iMessageService != null) {
            iMessageService.removeMessageListener("VSMSG_navToLiveRoom", new b(this));
        }
    }

    public void m(atb atbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a41b5e84", new Object[]{this, atbVar});
        } else {
            this.d = atbVar;
        }
    }
}
