package tb;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class m0 implements xnj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.xnj
    public String name() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this});
        }
        return "ABTestNavProcessor";
    }

    @Override // tb.xnj
    public boolean process(Intent intent, zmj zmjVar) {
        Variation variation;
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3ebca67", new Object[]{this, intent, zmjVar})).booleanValue();
        }
        try {
            Uri data = intent.getData();
            if (data != null) {
                String uri = data.toString();
                if (!TextUtils.isEmpty(uri) && (variation = UTABTest.activate(UTABTest.COMPONENT_NAV, uri).getVariation("bucket")) != null) {
                    String valueAsString = variation.getValueAsString(null);
                    if (!TextUtils.isEmpty(valueAsString) && !TextUtils.equals(uri, valueAsString) && (parse = Uri.parse(valueAsString)) != null) {
                        intent.setData(parse);
                        String queryParameter = parse.getQueryParameter("UTABTEST-LOOPBACK");
                        if (TextUtils.isEmpty(queryParameter)) {
                            zmjVar.t(false);
                        } else if (TextUtils.equals(oyl.PERMISSION_ALLOW, queryParameter)) {
                            zmjVar.t(false);
                        } else if (TextUtils.equals("disallow", queryParameter)) {
                            zmjVar.t(true);
                        }
                    }
                }
            }
        } catch (Throwable th) {
            Log.e("ABTestNavProcessor", th.toString());
        }
        return true;
    }

    @Override // tb.xnj
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        return false;
    }
}
