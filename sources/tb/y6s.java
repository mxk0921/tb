package tb;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridInstanceRenderMode;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_ability.page.WeexFragment;
import com.taobao.android.weex_framework.a;
import com.taobao.android.weex_framework.common.MUSEventTarget;
import com.taobao.tao.log.TLog;
import com.taobao.tmgcashier.TMGCashierActivity;
import com.taobao.tmgcashier.constant.TMGCashierRenderType;
import com.taobao.tmgcashier.fragment.TMGCashierWebView;
import com.taobao.tmgcashier.googlepay.TMGGooglePayUtils;
import com.taobao.tmgcashier.jsbridge.CashJSBridge;
import com.taobao.tmgcashier.jsbridge.TMGCashierJSBridge;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import tb.s6s;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class y6s extends u6s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final r6s f31883a;
    public String b;

    static {
        t2o.a(860880923);
    }

    public y6s(r6s r6sVar) {
        this.f31883a = r6sVar;
    }

    public static /* synthetic */ Object ipc$super(y6s y6sVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tmgcashier/vp/TMGCashierPresenter");
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d22906d", new Object[]{this});
            return;
        }
        Fragment b = b();
        if (b != null) {
            ((TMGCashierActivity) this.f31883a).q3(b, false, "");
        }
    }

    public final Fragment b() {
        TMGCashierRenderType tMGCashierRenderType;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("674689bb", new Object[]{this});
        }
        s6s a2 = w6s.b().a();
        if (a2 == null) {
            tMGCashierRenderType = TMGCashierRenderType.RENDER_TYPE_WEEX;
        } else {
            tMGCashierRenderType = a2.b();
        }
        Uri parse = Uri.parse(this.b);
        if (this.b.contains("front-cashier/selectpayment") && !TextUtils.isEmpty(pgl.d)) {
            try {
                this.b = parse.buildUpon().appendQueryParameter(t6s.BRIDGE_ACTION_CHECK_GOOGLE_PAY, pgl.d).build().toString();
            } catch (Exception e) {
                TLog.loge("tmgcashier", TMGCashierWebView.TAG, "isSupportGooglePay error:" + e.getMessage());
            }
            TLog.logd("tmgcashier", "tmgcashier", this.b);
        }
        if (tMGCashierRenderType != TMGCashierRenderType.RENDER_TYPE_WEEX || !z6s.a(this.b)) {
            return c(this.b);
        }
        if (this.b.contains("renderType=2") && !this.b.contains("wh_weex=true")) {
            this.b = parse.buildUpon().appendQueryParameter("wh_weex", "true").build().toString();
        }
        return d();
    }

    public final Fragment c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("cf50af35", new Object[]{this, str});
        }
        TMGCashierWebView tMGCashierWebView = new TMGCashierWebView(str);
        Bundle bundle = new Bundle();
        bundle.putString(TMGCashierWebView.CONTENT_URL, str);
        tMGCashierWebView.setArguments(bundle);
        return tMGCashierWebView;
    }

    public final Fragment d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("90c228fa", new Object[]{this});
        }
        WeexFragment weexFragment = null;
        try {
            String str = this.b;
            weexFragment = WeexFragment.B2(str, str, null, null, null);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("renderMode", UltronTradeHybridInstanceRenderMode.TEXTURE);
            Bundle arguments = weexFragment.getArguments();
            if (arguments != null) {
                arguments.putString("config", jSONObject.toString());
                weexFragment.setArguments(arguments);
            }
            weexFragment.T2(this);
            return weexFragment;
        } catch (Exception e) {
            e.getMessage();
            return weexFragment;
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f622f449", new Object[]{this});
            return;
        }
        r6s r6sVar = this.f31883a;
        if (r6sVar instanceof Activity) {
            ((Activity) r6sVar).finish();
        }
    }

    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf27f69a", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            this.b = str;
            ((TMGCashierActivity) this.f31883a).q3(b(), false, "");
        }
    }

    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("959fa4fb", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            Intent intent = new Intent(((TMGCashierActivity) this.f31883a).getContext(), TMGCashierActivity.class);
            intent.setData(Uri.parse(str));
            ((TMGCashierActivity) this.f31883a).getContext().startActivity(intent);
            e();
        }
    }

    public void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a19c682", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public void n(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ec3ac1a", new Object[]{this, wVCallBackContext});
            return;
        }
        r6s r6sVar = this.f31883a;
        if (r6sVar instanceof TMGCashierActivity) {
            ((TMGCashierActivity) r6sVar).getClass();
        }
    }

    public void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dade83e", new Object[]{this, str});
            return;
        }
        try {
            TMGGooglePayUtils.startGooglePay((Activity) this.f31883a, str);
        } catch (Throwable th) {
            TLog.loge("tmgcashier", TMGCashierWebView.TAG, "startGooglePay error:" + th.getMessage());
        }
    }

    public void p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a14862d5", new Object[]{this, str});
            return;
        }
        ((TMGCashierActivity) this.f31883a).p3();
        this.b = str;
        a();
    }

    public void f(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("361efd1e", new Object[]{this, intent});
            return;
        }
        String uri = intent.getData().toString();
        this.b = uri;
        if (TextUtils.isEmpty(uri)) {
            Toast.makeText(((TMGCashierActivity) this.f31883a).getContext(), "url 链接为空！", 0).show();
            e();
            return;
        }
        fsw.h("TMGCashier", TMGCashierJSBridge.class);
        fsw.h("ALBBCashier", CashJSBridge.class);
        if (w6s.b().a() == null) {
            s6s.b bVar = new s6s.b();
            bVar.b(TMGCashierRenderType.RENDER_TYPE_WEEX);
            w6s.b().c(bVar.a());
        }
        a();
    }

    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb0e11f7", new Object[]{this, str});
            return;
        }
        try {
            ((TMGCashierActivity) this.f31883a).q3(c(new JSONObject(str).optString("url")), false, "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void h() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30bd8c3e", new Object[]{this});
            return;
        }
        FragmentManager supportFragmentManager = ((TMGCashierActivity) this.f31883a).getSupportFragmentManager();
        List<Fragment> fragments = supportFragmentManager.getFragments();
        if (fragments.size() > 1) {
            FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
            Fragment fragment = fragments.get(fragments.size() - 1);
            if (fragments.size() > 1) {
                Fragment fragment2 = fragments.get(fragments.size() - 2);
                if (fragment2 == null) {
                    Log.e(TMGCashierWebView.TAG, "nextShowFragment 为空");
                    e();
                    return;
                }
                if (fragment2 instanceof WeexFragment) {
                    str = ((WeexFragment) fragment2).getBundleUrl();
                } else if (fragment2 instanceof TMGCashierWebView) {
                    str = ((TMGCashierWebView) fragment2).getBundleUrl();
                } else {
                    str = "";
                }
                m(str);
                beginTransaction.remove(fragment).show(fragment2).commitAllowingStateLoss();
                ((TMGCashierActivity) this.f31883a).l3(fragment2);
                return;
            }
            Log.e(TMGCashierWebView.TAG, "fragments size 小于2个");
            e();
            return;
        }
        e();
    }

    public void k(String str) throws JSONException {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("555dbb1b", new Object[]{this, str});
            return;
        }
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.isNull("url") ? null : jSONObject.getString("url");
        if (!TextUtils.isEmpty(string)) {
            this.b = string;
        }
        r6s r6sVar = this.f31883a;
        Fragment b = b();
        if (jSONObject.has("currentUrl")) {
            str2 = jSONObject.getString("currentUrl");
        } else {
            str2 = "";
        }
        ((TMGCashierActivity) r6sVar).q3(b, true, str2);
    }

    public void l(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f79584dd", new Object[]{this, map});
            return;
        }
        List<Fragment> fragments = ((TMGCashierActivity) this.f31883a).getSupportFragmentManager().getFragments();
        Fragment fragment = fragments.get(fragments.size() - 1);
        if (fragment instanceof WeexFragment) {
            ((WeexFragment) fragment).v2().dispatchEvent(MUSEventTarget.MUS_DOCUMENT_TARGET, "googlePayEvent", new com.alibaba.fastjson.JSONObject(map));
            TLog.logd("tmgcashier", TMGCashierWebView.TAG, "sendMessage2Web:weex2" + map.toString());
            return;
        }
        WVStandardEventCenter.postNotificationToJS(((TMGCashierWebView) fragment).r2(), "googlePayEvent", new com.alibaba.fastjson.JSONObject(map).toJSONString());
        TLog.logd("tmgcashier", TMGCashierWebView.TAG, "sendMessage2Web:H5" + map.toString());
    }

    @Override // tb.npc
    public void onRenderFailed(a aVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc0cbe2b", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
            return;
        }
        ((TMGCashierActivity) this.f31883a).q3(c(this.b.replace("renderType=2", "").replace("wh_weex=true", "")), true, "");
        z7s.b("Page_OverseaNewCashier", 2101, "Page_OverseaNewCashier_weexDowngrade", "oversea_url:" + this.b);
    }
}
