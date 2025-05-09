package tb;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.BundleInfoManager;
import com.android.tools.bundleInfo.BundleListing;
import com.taobao.appbundle.a;
import com.taobao.appbundle.remote.LoadConfig;
import com.taobao.appbundle.runtime.ModuleDependencyUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class b0k implements xnj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(377487399);
        t2o.a(578814049);
    }

    public static void c(String str, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78f6dd11", new Object[]{str, intent});
            return;
        }
        a.C0529a aVar = a.Companion;
        if (!TextUtils.isEmpty(aVar.a().g(str))) {
            Intent intent2 = new Intent();
            intent2.setAction("android.intent.action.VIEW");
            intent2.setData(Uri.parse(aVar.a().g(str)));
            intent2.addCategory("com.taobao.intent.category.HYBRID_UI");
            intent.putExtra("load_config", new LoadConfig.b().n(intent2).l());
        }
    }

    public final boolean a(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b64ebe1", new Object[]{this, list})).booleanValue();
        }
        return a.Companion.a().h().f().containsAll(list);
    }

    public final boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("85f05698", new Object[]{this, str})).booleanValue();
        }
        try {
            Class.forName(str);
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    @Override // tb.xnj
    public String name() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this});
        }
        return "NewFeatureNavProcessor";
    }

    @Override // tb.xnj
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        if (a.Companion.a().d() != null && !BundleInfoManager.instance().isAppBundleEnabled()) {
            return false;
        }
        return true;
    }

    @Override // tb.xnj
    public boolean process(Intent intent, zmj zmjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3ebca67", new Object[]{this, intent, zmjVar})).booleanValue();
        }
        Log.e("NewFeatureNavProcessor", "beforeNavTo+ " + intent);
        Intent intent2 = new Intent();
        ComponentName component = intent.getComponent();
        if (!(component == null || component.getClassName() == null)) {
            String className = component.getClassName();
            if (!TextUtils.isEmpty(className)) {
                boolean isDynamicActivity = BundleInfoManager.instance().isDynamicActivity(className);
                BundleListing.a bundleInfoFromActivity = BundleInfoManager.instance().getBundleInfoFromActivity(className);
                ArrayList arrayList = new ArrayList();
                if (isDynamicActivity && !TextUtils.isEmpty(bundleInfoFromActivity.c)) {
                    arrayList.add(bundleInfoFromActivity.c);
                    arrayList.addAll(ModuleDependencyUtils.getDependencies(bundleInfoFromActivity.c));
                    kyn.a(bundleInfoFromActivity.c, intent.getDataString());
                }
                if (isDynamicActivity && (b(className) || !a(arrayList))) {
                    Log.e("NewFeatureNavProcessor", intent.toString());
                    if (BundleInfoManager.instance().isFlexaEnabled()) {
                        a.C0529a aVar = a.Companion;
                        ucq h = aVar.a().h();
                        if (h != null) {
                            acq.A(aVar.a().d(), (String[]) arrayList.toArray(new String[0]));
                            if (h.f().containsAll(arrayList)) {
                                return true;
                            }
                            if (aVar.a().i(bundleInfoFromActivity.c) != null) {
                                intent2.setClass(zmjVar.d(), aVar.a().i(bundleInfoFromActivity.c));
                            }
                        }
                    }
                    c(bundleInfoFromActivity.c, intent2);
                    intent2.setPackage(zmjVar.h());
                    intent2.putExtra("feature_name", bundleInfoFromActivity.c);
                    intent2.putExtra("orignal_intent", intent);
                    if (zmjVar.i() > 0) {
                        intent2.putExtra("request_code", zmjVar.i());
                        if (zmjVar.d() instanceof Activity) {
                            ((Activity) zmjVar.d()).startActivityForResult(intent2, zmjVar.i());
                        }
                    } else {
                        intent2.setFlags(268435456);
                        a.Companion.a().d().startActivity(intent2);
                    }
                    return false;
                }
            }
        }
        return true;
    }
}
