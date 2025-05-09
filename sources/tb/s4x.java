package tb;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSInstanceConfig;
import kotlin.Metadata;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ltb/s4x;", "Ltb/m54;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "tbi_uniContainer_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class s4x extends m54 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final FrameLayout c;
    public View d;
    public com.taobao.android.weex_framework.a e;
    public final npc f = new b();
    public final Context g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements kpc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.kpc
        public final void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1414cfeb", new Object[]{this, view});
                return;
            }
            s4x.i(s4x.this, view);
            s4x.g(s4x.this).removeAllViews();
            s4x.g(s4x.this).addView(s4x.h(s4x.this), new FrameLayout.LayoutParams(-1, -1));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class b implements npc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.npc
        public void onDestroyed(MUSDKInstance mUSDKInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
            }
        }

        @Override // tb.npc
        public void onJSException(com.taobao.android.weex_framework.a aVar, int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8c41b6de", new Object[]{this, aVar, new Integer(i), str});
            }
        }

        @Override // tb.npc
        public void onPrepareSuccess(com.taobao.android.weex_framework.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("27a2635b", new Object[]{this, aVar});
            }
        }

        @Override // tb.npc
        public void onRefreshFailed(com.taobao.android.weex_framework.a aVar, int i, String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc0861e4", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
            }
        }

        @Override // tb.npc
        public void onRefreshSuccess(com.taobao.android.weex_framework.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("963c382f", new Object[]{this, aVar});
            }
        }

        @Override // tb.npc
        public void onRenderFailed(com.taobao.android.weex_framework.a aVar, int i, String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc0cbe2b", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
            }
        }

        @Override // tb.npc
        public void onRenderSuccess(com.taobao.android.weex_framework.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2b2aeb48", new Object[]{this, aVar});
            }
        }
    }

    static {
        t2o.a(804257835);
    }

    public s4x(Context context) {
        ckf.g(context, "context");
        this.g = context;
        this.c = new FrameLayout(context);
    }

    public static final /* synthetic */ View h(s4x s4xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ed0c2f25", new Object[]{s4xVar});
        }
        return s4xVar.d;
    }

    public static final /* synthetic */ void i(s4x s4xVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b4db5c3", new Object[]{s4xVar, view});
        } else {
            s4xVar.d = view;
        }
    }

    public static /* synthetic */ Object ipc$super(s4x s4xVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/industry/tbiunicontainer/core/component/WeexComponent");
    }

    @Override // tb.na4
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e328d7b", new Object[]{this});
        } else {
            j();
        }
    }

    @Override // tb.na4
    public View d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        MUSInstanceConfig mUSInstanceConfig = new MUSInstanceConfig();
        mUSInstanceConfig.B(true);
        mUSInstanceConfig.t(MUSInstanceConfig.MUSRenderType.MUSRenderTypeUnicorn);
        mUSInstanceConfig.y(MUSInstanceConfig.RenderMode.texture);
        mUSInstanceConfig.v(false);
        mUSInstanceConfig.u(new a());
        com.taobao.android.weex_framework.a c = com.taobao.android.weex_framework.b.f().c(this.g, mUSInstanceConfig);
        this.e = c;
        if (c != null) {
            c.registerRenderListener(this.f);
        }
        return this.c;
    }

    @Override // tb.na4
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        }
    }

    public void j() {
        JSONObject jSONObject;
        JSONObject a2;
        String jSONString;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5a391a0", new Object[]{this});
            return;
        }
        byte[] bArr = null;
        if (this.d == null) {
            com.taobao.android.weex_framework.a aVar = this.e;
            if (aVar != null) {
                mb4<JSONObject> b2 = b();
                if (!(b2 == null || (a2 = b2.a()) == null || (jSONString = a2.toJSONString()) == null)) {
                    bArr = jSONString.getBytes(uj3.UTF_8);
                    ckf.f(bArr, "(this as java.lang.String).getBytes(charset)");
                }
                aVar.initWithData(bArr, Uri.parse(c().c()));
                return;
            }
            return;
        }
        com.taobao.android.weex_framework.a aVar2 = this.e;
        if (aVar2 != null) {
            mb4<JSONObject> b3 = b();
            if (b3 != null) {
                jSONObject = b3.a();
            } else {
                jSONObject = null;
            }
            aVar2.render(jSONObject, null);
        }
    }

    public static final /* synthetic */ FrameLayout g(s4x s4xVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("fe09dd55", new Object[]{s4xVar}) : s4xVar.c;
    }
}
