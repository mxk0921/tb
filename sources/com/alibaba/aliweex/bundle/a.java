package com.alibaba.aliweex.bundle;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.alibaba.aliweex.bundle.WeexPageFragment;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.common.WXErrorCode;
import com.taobao.weex.utils.WXExceptionUtils;
import com.taobao.weex.utils.WXLogUtils;
import java.util.HashMap;
import tb.d2i;
import tb.d97;
import tb.f2i;
import tb.gbe;
import tb.j2v;
import tb.n7x;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class a implements gbe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ViewGroup f2095a;
    public d2i b;
    public final n7x c;
    public final f2i d;
    public WeexPageFragment.b e;
    public final WeexPageFragment.b f;

    static {
        t2o.a(85983282);
        t2o.a(985661443);
    }

    public a(ViewGroup viewGroup, n7x n7xVar, f2i f2iVar, WeexPageFragment.b bVar, WeexPageFragment.b bVar2) {
        this.f2095a = viewGroup;
        this.c = n7xVar;
        this.d = f2iVar;
        this.e = bVar;
        this.f = bVar2;
    }

    public WeexPageFragment.b a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexPageFragment.b) ipChange.ipc$dispatch("9686969c", new Object[]{this});
        }
        return this.e;
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d9c7286", new Object[]{this})).booleanValue();
        }
        WeexPageFragment.b bVar = this.e;
        if (bVar == null || !bVar.needWrapper()) {
            return false;
        }
        return true;
    }

    public final void c(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99d238fb", new Object[]{this, view});
        } else if (view != null && view.getParent() != null && (view.getParent() instanceof ViewGroup)) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(android.view.View r5) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.aliweex.bundle.a.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0015
            java.lang.String r1 = "d8956885"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r3 = 1
            r2[r3] = r5
            r0.ipc$dispatch(r1, r2)
            return
        L_0x0015:
            android.view.ViewGroup r0 = r4.f2095a
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x0035
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x0035
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r1 = r0.getChildCount()
            if (r1 <= 0) goto L_0x0035
            int r1 = com.taobao.taobao.R.id.weex_render_view
            android.view.View r0 = r0.findViewById(r1)
            if (r0 == 0) goto L_0x0036
            r4.c(r0)
            goto L_0x0036
        L_0x0035:
            r0 = 0
        L_0x0036:
            if (r0 != 0) goto L_0x0047
            android.view.ViewGroup r0 = r4.f2095a
            int r1 = com.taobao.taobao.R.id.weex_render_view
            android.view.View r0 = r0.findViewById(r1)
            if (r0 == 0) goto L_0x0047
            android.view.ViewGroup r1 = r4.f2095a
            r1.removeView(r0)
        L_0x0047:
            if (r0 != 0) goto L_0x004c
            r4.c(r5)
        L_0x004c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.aliweex.bundle.a.d(android.view.View):void");
    }

    public void f(d2i d2iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65a0a070", new Object[]{this, d2iVar});
        } else {
            this.b = d2iVar;
        }
    }

    public void g(WeexPageFragment.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9e4dd32", new Object[]{this, bVar});
        } else {
            this.e = bVar;
        }
    }

    @Override // tb.gbe
    public void onRefreshSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d57f8320", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
            return;
        }
        WXLogUtils.d("WXRenderListener", "into--[onRefreshSuccess]");
        n7x n7xVar = this.c;
        if (n7xVar != null) {
            n7xVar.b(false);
        }
    }

    @Override // tb.gbe
    public void onRenderSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c414a5f9", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
            return;
        }
        WXLogUtils.d("WXRenderListener", "into--[onRenderSuccess]");
        WeexPageFragment.b bVar = this.e;
        if (bVar != null) {
            bVar.onRenderSuccess(wXSDKInstance, i, i2);
        }
        n7x n7xVar = this.c;
        if (n7xVar != null) {
            n7xVar.b(false);
        }
    }

    @Override // tb.gbe
    public void onViewCreated(WXSDKInstance wXSDKInstance, View view) {
        View view2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eab5f0f", new Object[]{this, wXSDKInstance, view});
            return;
        }
        WXLogUtils.d("WXRenderListener", "into--[onViewCreated]");
        if (this.f2095a != null) {
            if (b()) {
                d(view);
                WeexPageFragment.b bVar = this.e;
                if (bVar != null) {
                    view2 = bVar.onCreateView(wXSDKInstance, view);
                } else {
                    view2 = view;
                }
                view2.setId(R.id.weex_render_view);
                if (this.f2095a.getParent() instanceof FrameLayout) {
                    ((ViewGroup) this.f2095a.getParent()).addView(view2);
                } else {
                    this.f2095a.addView(view2);
                }
            } else if (view.getParent() == null) {
                if (this.f2095a.getChildCount() > 2) {
                    this.f2095a.removeViewAt(2);
                }
                this.f2095a.addView(view);
            }
            n7x n7xVar = this.c;
            if (n7xVar != null) {
                n7xVar.b(false);
            }
            this.f.onViewCreated(wXSDKInstance, view);
            WeexPageFragment.b bVar2 = this.e;
            if (bVar2 != null) {
                bVar2.onViewCreated(wXSDKInstance, view);
            }
            f2i f2iVar = this.d;
            if (f2iVar != null) {
                ((j2v) f2iVar).i(wXSDKInstance);
            }
        }
    }

    public final void e(WXSDKInstance wXSDKInstance, String str) {
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dcb38a5", new Object[]{this, wXSDKInstance, str});
            return;
        }
        HashMap hashMap = new HashMap(1);
        if (!TextUtils.isEmpty(str) && str.contains("networkMsg==") && str.contains("networkErrorCode") && (indexOf = str.indexOf("|mWXResponse")) > 0) {
            String substring = str.substring(0, indexOf);
            hashMap.put("wxErrorMsgDetail", str);
            str = substring;
        }
        String N = wXSDKInstance.N();
        WXErrorCode wXErrorCode = WXErrorCode.WX_KEY_EXCEPTION_JS_DOWNLOAD_FAILED;
        WXExceptionUtils.commitCriticalExceptionRT(N, wXErrorCode, "WXRenderListener.onException", wXErrorCode.getErrorMsg() + "--" + str, hashMap);
    }

    @Override // tb.gbe
    public void onException(WXSDKInstance wXSDKInstance, String str, String str2) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88f82eeb", new Object[]{this, wXSDKInstance, str, str2});
            return;
        }
        WXLogUtils.d("WXRenderListener", "into--[onException] errCode:" + str + " msg:" + str2);
        if (TextUtils.equals(str, WXErrorCode.WX_DEGRAD_ERR_NETWORK_BUNDLE_DOWNLOAD_FAILED.getErrorCode())) {
            ((d97) this.b).b(wXSDKInstance.getContext(), this.f2095a);
            ((d97) this.b).d(true, "网络错误，点击刷新重试！");
            e(wXSDKInstance, str2);
            z = false;
        } else {
            z = WeexPageFragment.shouldDegrade(wXSDKInstance, str, str2);
        }
        if (WXEnvironment.isApkDebugable()) {
            Toast.makeText(wXSDKInstance.getContext(), str2, 1).show();
        }
        n7x n7xVar = this.c;
        if (n7xVar != null) {
            n7xVar.b(false);
        }
        this.f.onException(wXSDKInstance, str, str2);
        WeexPageFragment.b bVar = this.e;
        if (bVar != null) {
            bVar.onException(wXSDKInstance, z, str, str2);
        }
    }
}
