package tb;

import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\b&\u0018\u0000 )2\u00020\u0001:\u0003*+,B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\"\u0010\u001a\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\"\u0010#\u001a\u00020\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006-"}, d2 = {"Ltb/qx;", "", "<init>", "()V", "Ltb/xhv;", "commit", "Lcom/alibaba/fastjson/JSONObject;", "generatePosition", "()Lcom/alibaba/fastjson/JSONObject;", "", "titleBarHeight", TLogTracker.LEVEL_INFO, "getTitleBarHeight", "()I", "setTitleBarHeight", "(I)V", "Ltb/qx$c;", "leftPanel", "Ltb/qx$c;", "getLeftPanel", "()Ltb/qx$c;", "setLeftPanel", "(Ltb/qx$c;)V", "centerPanel", "getCenterPanel", "setCenterPanel", "rightPanel", "getRightPanel", "setRightPanel", "", "safeAreaInsets", "[I", "getSafeAreaInsets", "()[I", "", gl4.CONFIG_IMMERSIVE, "Z", "getImmersive", "()Z", "setImmersive", "(Z)V", "Companion", "a", TplMsg.VALUE_T_NATIVE_RETURN, "c", "themis_container_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class qx {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String EVENT_NAME = "updateNavbarPosition";
    public static final String TARGET = "navigator.navBarPosition";
    private boolean immersive;
    private int titleBarHeight = 44;
    private c leftPanel = new c();
    private c centerPanel = new c();
    private c rightPanel = new c();
    private final int[] safeAreaInsets = new int[4];

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(835715202);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f26979a;
        public int b;
        public int c;
        public int d;
        public String e = "";

        static {
            t2o.a(835715203);
        }

        public final int a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
            }
            return this.b;
        }

        public final int b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e2350677", new Object[]{this})).intValue();
            }
            return this.c;
        }

        public final int c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f9c9cf19", new Object[]{this})).intValue();
            }
            return this.d;
        }

        public final String d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
            }
            return this.e;
        }

        public final int e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue();
            }
            return this.f26979a;
        }

        public final void f(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2fde48d3", new Object[]{this, new Integer(i)});
            } else {
                this.b = i;
            }
        }

        public final void g(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c0bffd73", new Object[]{this, new Integer(i)});
            } else {
                this.c = i;
            }
        }

        public final void h(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a28e9a9", new Object[]{this, new Integer(i)});
            } else {
                this.d = i;
            }
        }

        public final void i(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fd56044d", new Object[]{this, str});
                return;
            }
            ckf.g(str, "<set-?>");
            this.e = str;
        }

        public final void j(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("baf60358", new Object[]{this, new Integer(i)});
            } else {
                this.f26979a = i;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f26980a;
        public int b;
        public int c;
        public int d;
        public final List<b> e = new ArrayList();

        static {
            t2o.a(835715204);
        }

        public final int a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
            }
            return this.b;
        }

        public final List<b> b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("46e3e096", new Object[]{this});
            }
            return this.e;
        }

        public final int c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e2350677", new Object[]{this})).intValue();
            }
            return this.c;
        }

        public final int d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f9c9cf19", new Object[]{this})).intValue();
            }
            return this.d;
        }

        public final int e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue();
            }
            return this.f26980a;
        }

        public final void f(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2fde48d3", new Object[]{this, new Integer(i)});
            } else {
                this.b = i;
            }
        }

        public final void g(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c0bffd73", new Object[]{this, new Integer(i)});
            } else {
                this.c = i;
            }
        }

        public final void h(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a28e9a9", new Object[]{this, new Integer(i)});
            } else {
                this.d = i;
            }
        }

        public final void i(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("baf60358", new Object[]{this, new Integer(i)});
            } else {
                this.f26980a = i;
            }
        }
    }

    static {
        t2o.a(835715200);
    }

    public abstract void commit();

    public final JSONObject generatePosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("eaab9a65", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "titleBarHeight", (String) Integer.valueOf(getTitleBarHeight()));
        jSONObject.put((JSONObject) "safeAreaInsets", (String) getSafeAreaInsets());
        jSONObject.put((JSONObject) gl4.CONFIG_IMMERSIVE, (String) Boolean.valueOf(getImmersive()));
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put((JSONObject) "width", (String) Integer.valueOf(getLeftPanel().e()));
        jSONObject2.put((JSONObject) "height", (String) Integer.valueOf(getLeftPanel().a()));
        jSONObject2.put((JSONObject) "left", (String) Integer.valueOf(getLeftPanel().c()));
        jSONObject2.put((JSONObject) "top", (String) Integer.valueOf(getLeftPanel().d()));
        List<b> b2 = getLeftPanel().b();
        ArrayList arrayList = new ArrayList(zz3.q(b2, 10));
        for (b bVar : b2) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put((JSONObject) "width", (String) Integer.valueOf(bVar.e()));
            jSONObject3.put((JSONObject) "height", (String) Integer.valueOf(bVar.a()));
            jSONObject3.put((JSONObject) "left", (String) Integer.valueOf(bVar.b()));
            jSONObject3.put((JSONObject) "top", (String) Integer.valueOf(bVar.c()));
            jSONObject3.put((JSONObject) "type", bVar.d());
            arrayList.add(jSONObject3);
        }
        jSONObject2.put((JSONObject) "items", (String) arrayList);
        xhv xhvVar = xhv.INSTANCE;
        jSONObject.put((JSONObject) "leftPanel", (String) jSONObject2);
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put((JSONObject) "width", (String) Integer.valueOf(getCenterPanel().e()));
        jSONObject4.put((JSONObject) "height", (String) Integer.valueOf(getCenterPanel().a()));
        jSONObject4.put((JSONObject) "left", (String) Integer.valueOf(getCenterPanel().c()));
        jSONObject4.put((JSONObject) "top", (String) Integer.valueOf(getCenterPanel().d()));
        List<b> b3 = getCenterPanel().b();
        ArrayList arrayList2 = new ArrayList(zz3.q(b3, 10));
        for (b bVar2 : b3) {
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put((JSONObject) "width", (String) Integer.valueOf(bVar2.e()));
            jSONObject5.put((JSONObject) "height", (String) Integer.valueOf(bVar2.a()));
            jSONObject5.put((JSONObject) "left", (String) Integer.valueOf(bVar2.b()));
            jSONObject5.put((JSONObject) "top", (String) Integer.valueOf(bVar2.c()));
            jSONObject5.put((JSONObject) "type", bVar2.d());
            arrayList2.add(jSONObject5);
        }
        jSONObject4.put((JSONObject) "items", (String) arrayList2);
        xhv xhvVar2 = xhv.INSTANCE;
        jSONObject.put((JSONObject) "centerPanel", (String) jSONObject4);
        JSONObject jSONObject6 = new JSONObject();
        jSONObject6.put((JSONObject) "width", (String) Integer.valueOf(getRightPanel().e()));
        jSONObject6.put((JSONObject) "height", (String) Integer.valueOf(getRightPanel().a()));
        jSONObject6.put((JSONObject) "left", (String) Integer.valueOf(getRightPanel().c()));
        jSONObject6.put((JSONObject) "top", (String) Integer.valueOf(getRightPanel().d()));
        List<b> b4 = getRightPanel().b();
        ArrayList arrayList3 = new ArrayList(zz3.q(b4, 10));
        for (b bVar3 : b4) {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put((JSONObject) "width", (String) Integer.valueOf(bVar3.e()));
            jSONObject7.put((JSONObject) "height", (String) Integer.valueOf(bVar3.a()));
            jSONObject7.put((JSONObject) "left", (String) Integer.valueOf(bVar3.b()));
            jSONObject7.put((JSONObject) "top", (String) Integer.valueOf(bVar3.c()));
            jSONObject7.put((JSONObject) "type", bVar3.d());
            arrayList3.add(jSONObject7);
        }
        jSONObject6.put((JSONObject) "items", (String) arrayList3);
        xhv xhvVar3 = xhv.INSTANCE;
        jSONObject.put((JSONObject) "rightPanel", (String) jSONObject6);
        return jSONObject;
    }

    public final c getCenterPanel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("d0956779", new Object[]{this});
        }
        return this.centerPanel;
    }

    public final boolean getImmersive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d02a1610", new Object[]{this})).booleanValue();
        }
        return this.immersive;
    }

    public final c getLeftPanel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("94e3a607", new Object[]{this});
        }
        return this.leftPanel;
    }

    public final c getRightPanel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("705537fe", new Object[]{this});
        }
        return this.rightPanel;
    }

    public final int[] getSafeAreaInsets() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("853bcab7", new Object[]{this});
        }
        return this.safeAreaInsets;
    }

    public final int getTitleBarHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fbd0c512", new Object[]{this})).intValue();
        }
        return this.titleBarHeight;
    }

    public final void setCenterPanel(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ddf54d5", new Object[]{this, cVar});
            return;
        }
        ckf.g(cVar, "<set-?>");
        this.centerPanel = cVar;
    }

    public final void setImmersive(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd0fc654", new Object[]{this, new Boolean(z)});
        } else {
            this.immersive = z;
        }
    }

    public final void setLeftPanel(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa0d7b07", new Object[]{this, cVar});
            return;
        }
        ckf.g(cVar, "<set-?>");
        this.leftPanel = cVar;
    }

    public final void setRightPanel(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f988358", new Object[]{this, cVar});
            return;
        }
        ckf.g(cVar, "<set-?>");
        this.rightPanel = cVar;
    }

    public final void setTitleBarHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc8d1138", new Object[]{this, new Integer(i)});
        } else {
            this.titleBarHeight = i;
        }
    }
}
