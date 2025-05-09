package tb;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.weex.common.Constants;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class af {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String INSTANCE_ID = "instanceId";
    public static final String MUS = "com.taobao.android.intent.category.MUS";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ UINode f15702a;

        public a(UINode uINode) {
            this.f15702a = uINode;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                af.a(this.f15702a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ UINode f15703a;

        public b(UINode uINode) {
            this.f15703a = uINode;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                af.a(this.f15703a);
            }
        }
    }

    static {
        t2o.a(986710125);
    }

    public static /* synthetic */ void a(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29d5af1", new Object[]{uINode});
        } else {
            b(uINode);
        }
    }

    public static void b(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cd29ea3", new Object[]{uINode});
            return;
        }
        String str = (String) uINode.getAttribute(Constants.Name.HREF);
        if (!TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            if (TextUtils.isEmpty(scheme) || "http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                e(uINode, str);
                return;
            }
            try {
                uINode.getInstance().getUIContext().startActivity(new Intent("android.intent.action.VIEW", parse));
            } catch (Throwable th) {
                wvh.a().b("A.onHrefClick", th);
                dwh.h("A", th);
            }
        }
    }

    public static void c(UINode uINode, MUSDKInstance mUSDKInstance, Object obj, egl<View.OnClickListener> eglVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68880884", new Object[]{uINode, mUSDKInstance, obj, eglVar});
        } else if (!TextUtils.isEmpty((String) uINode.getAttribute(Constants.Name.HREF))) {
            eglVar.c(new b(uINode));
            uINode.addOnClickListener(eglVar.a());
        }
    }

    public static void d(UINode uINode, MUSDKInstance mUSDKInstance, Object obj, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cae611e7", new Object[]{uINode, mUSDKInstance, obj, onClickListener});
        } else if (onClickListener != null) {
            uINode.removeClickListener(onClickListener);
        }
    }

    public static void e(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("909cf911", new Object[]{uINode, str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("url", (Object) str);
        String jSONString = jSONObject.toJSONString();
        MUSDKInstance instance = uINode.getInstance();
        if (instance.getActivityNav() == null || !instance.getActivityNav().a(uINode.getInstance().getUIContext(), uINode.getInstance(), jSONString)) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    Uri parse = Uri.parse(str);
                    String scheme = parse.getScheme();
                    Uri.Builder buildUpon = parse.buildUpon();
                    if (TextUtils.isEmpty(scheme)) {
                        buildUpon.scheme("http");
                    }
                    Intent intent = new Intent("android.intent.action.VIEW", buildUpon.build());
                    intent.addCategory("com.taobao.android.intent.category.MUS");
                    intent.putExtra("instanceId", instance.getInstanceId());
                    instance.getUIContext().startActivity(intent);
                }
            } catch (Exception e) {
                wvh.a().b("A.push", e);
                dwh.h("A", e);
            }
        }
    }

    public static void f(UINode uINode, Object obj, String str, View.OnClickListener onClickListener, egl<View.OnClickListener> eglVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("288465", new Object[]{uINode, obj, str, onClickListener, eglVar});
        } else if (TextUtils.isEmpty(str)) {
            if (onClickListener != null) {
                uINode.removeClickListener(onClickListener);
            }
            eglVar.c(null);
        } else {
            eglVar.c(new a(uINode));
            uINode.addOnClickListener(eglVar.a());
        }
    }

    public static void g(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf0bc7a", new Object[]{uINode, str});
        } else {
            uINode.setAttribute(Constants.Name.HREF, str);
        }
    }
}
