package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.common.util.SymbolExpUtil;
import tb.bpt;
import tb.e2s;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class i77 implements e2s.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f21138a;

    static {
        t2o.a(301989918);
        t2o.a(301989921);
    }

    public i77(Context context) {
        this.f21138a = context;
    }

    @Override // tb.e2s.a
    public Map<String, List<String>> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8d3fa450", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        JSONObject b = b();
        if (b != null) {
            for (String str : b.keySet()) {
                if (!TextUtils.isEmpty(str)) {
                    String string = b.getString(str);
                    if (!TextUtils.isEmpty(string)) {
                        String[] split = string.split(SymbolExpUtil.SYMBOL_VERTICALBAR);
                        if (split.length > 0) {
                            ArrayList arrayList = new ArrayList();
                            Collections.addAll(arrayList, split);
                            hashMap.put(str, arrayList);
                        }
                    }
                }
            }
        }
        return hashMap;
    }

    public final JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2a24d6d2", new Object[]{this});
        }
        if (this.f21138a == null) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(AssetsDelegate.proxy_open(this.f21138a.getAssets(), bpt.b.PATH)));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                } else {
                    bufferedReader.close();
                    return JSON.parseObject(sb.toString());
                }
            }
        } catch (Exception unused) {
            return null;
        }
    }
}
