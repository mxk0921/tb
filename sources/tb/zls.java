package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.taskcontext.baseparams.TimeContent;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class zls extends tls {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PREFIX = "@queryConcat(";
    public static final int SUB_INDEX = 13;

    static {
        t2o.a(329252950);
    }

    public static /* synthetic */ Object ipc$super(zls zlsVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tschedule/parser/operator/TSQueryConcatOperator");
    }

    @Override // tb.tls
    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ada0f062", new Object[]{this})).intValue();
        }
        return 13;
    }

    @Override // tb.tls
    public Object c(wp8 wp8Var) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("f75136", new Object[]{this, wp8Var});
        }
        List<Object> list = this.f28789a;
        if (list != null && !list.isEmpty()) {
            try {
                TreeMap treeMap = new TreeMap();
                Object l = wp8Var.l(this.f28789a.get(0));
                if ((l instanceof TimeContent) && zms.b(wms.TIME_CONTENT_FIX, true)) {
                    l = ((TimeContent) l).content;
                }
                if (!(l instanceof String)) {
                    return null;
                }
                Uri parse = Uri.parse((String) l);
                Set<String> queryParameterNames = parse.getQueryParameterNames();
                if (queryParameterNames != null) {
                    queryParameterNames.isEmpty();
                }
                for (String str : queryParameterNames) {
                    String queryParameter = parse.getQueryParameter(str);
                    if (!TextUtils.isEmpty(queryParameter)) {
                        String encode = Uri.encode(queryParameter);
                        zdh.a(tls.TAG, "origin value = " + queryParameter + "; encode value = " + encode);
                        treeMap.put(str, encode);
                    }
                }
                Uri build = parse.buildUpon().clearQuery().build();
                zdh.a(tls.TAG, "parse queryConcat: originUrl = +" + l.toString() + "baseUrl = " + build.toString());
                for (int i = 1; i < this.f28789a.size(); i++) {
                    Object l2 = wp8Var.l(this.f28789a.get(i));
                    if (l2 instanceof String) {
                        for (String str2 : ((String) l2).split("&")) {
                            String[] split = str2.split("=");
                            if (split.length == 2) {
                                treeMap.put(split[0], split[1]);
                            }
                        }
                    }
                    if (l2 instanceof Map) {
                        for (Map.Entry entry : ((Map) l2).entrySet()) {
                            if ((entry.getKey() instanceof String) && (entry.getValue() instanceof String)) {
                                treeMap.put((String) entry.getKey(), (String) entry.getValue());
                            }
                        }
                    }
                }
                zdh.a(tls.TAG, "parse queryConcat: queryMap size = " + treeMap.size());
                if (treeMap.size() > 0) {
                    StringBuilder sb = new StringBuilder(build.toString());
                    sb.append("?");
                    for (Map.Entry entry2 : treeMap.entrySet()) {
                        if (z) {
                            sb.append((String) entry2.getKey());
                            sb.append("=");
                            sb.append((String) entry2.getValue());
                            z = false;
                        } else {
                            sb.append("&");
                            sb.append((String) entry2.getKey());
                            sb.append("=");
                            sb.append((String) entry2.getValue());
                        }
                    }
                    zdh.a(tls.TAG, "parse queryConcat: result = " + ((Object) sb));
                    return sb.toString();
                }
            } catch (Exception e) {
                e.printStackTrace();
                zdh.b(tls.TAG, "parse value error in queryConcat operator", e);
            }
        }
        return null;
    }
}
