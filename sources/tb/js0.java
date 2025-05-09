package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.click.cpc.CpcClickBuilder;
import com.taobao.alimama.click.cpm.CpmClickBuilder;
import com.taobao.alimama.click.cps.CpsClickBuilder;
import com.taobao.alimama.utils.UserTrackLogs;
import com.taobao.munion.taosdk.CpcEventCommitter;
import com.taobao.munion.taosdk.CpmEventCommitter;
import com.taobao.utils.Global;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class js0 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CLICK_ID = "clickid";
    public static final String E_TYPE = "etype";
    public static final String E_URL = "eurl";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static volatile js0 f22180a = new js0();

        static {
            t2o.a(1017118723);
        }
    }

    static {
        t2o.a(1017118722);
    }

    public static js0 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (js0) ipChange.ipc$dispatch("110278eb", new Object[0]);
        }
        return a.f22180a;
    }

    public final Uri a(Uri uri) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("2161c059", new Object[]{this, uri});
        }
        if (uri == null) {
            return null;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (TextUtils.isEmpty(encodedQuery)) {
            return uri;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : encodedQuery.split("&")) {
            String lowerCase = str.toLowerCase();
            if (!lowerCase.startsWith("eurl=") && !lowerCase.startsWith("etype=")) {
                arrayList.add(str);
            }
        }
        Uri.Builder buildUpon = uri.buildUpon();
        if (!arrayList.isEmpty()) {
            buildUpon.encodedQuery(TextUtils.join("&", arrayList));
        }
        return buildUpon.build();
    }

    public String c(String str, boolean z, boolean z2) {
        Uri uri;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fc586b6b", new Object[]{this, str, new Boolean(z), new Boolean(z2)});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            Uri parse = Uri.parse(str);
            String queryParameter = parse.getQueryParameter(E_URL);
            if (TextUtils.isEmpty(queryParameter)) {
                return str;
            }
            String queryParameter2 = parse.getQueryParameter("etype");
            Uri parse2 = Uri.parse(queryParameter);
            String str2 = "";
            if (vm2.p() && parse2.isHierarchical()) {
                str2 = parse2.getQueryParameter("eadt");
            }
            try {
                String queryParameter3 = parse.getQueryParameter("acttype");
                if (!TextUtils.isEmpty(queryParameter3) && parse2.isHierarchical()) {
                    queryParameter = parse2.buildUpon().appendQueryParameter("atype", queryParameter3).toString();
                    i4g.a("append_eurl_acttype", "eurl = " + queryParameter + ", url = " + str);
                }
            } catch (Exception e) {
                UserTrackLogs.trackAdLog("append_eurl_acttype", z9u.ARG_TAOKE_ERROR + e.getMessage());
            }
            if ("1".equals(queryParameter2)) {
                if (vm2.k()) {
                    uri = Uri.parse(new CpcClickBuilder(queryParameter).withArgAUrl(str).withArgEadt(str2).withArgIsOpenPage(z).commitAndAppendClickid(str));
                } else {
                    uri = new CpcEventCommitter(Global.getApplication(), z).setEadt(str2).commitEvent(queryParameter, parse);
                }
            } else if ("2".equals(queryParameter2)) {
                uri = new CpsClickBuilder().commitAndAppendClickid(queryParameter, parse);
            } else if (!"3".equals(queryParameter2)) {
                uri = null;
            } else if (vm2.m()) {
                uri = Uri.parse(new CpmClickBuilder(queryParameter).withArgAUrl(str).withArgEadt(str2).withArgIsOpenPage(z).commitAndAppendClickid(str));
            } else {
                uri = new CpmEventCommitter(Global.getApplication(), z).setEadt(str2).commitEvent(queryParameter, parse);
            }
            if (uri != null && z2) {
                uri = a(uri);
            }
            if (uri != null) {
                return uri.toString();
            }
            return str;
        } catch (Exception unused) {
            return str;
        }
    }

    public String d(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d61f6a5b", new Object[]{this, str, new Boolean(z)});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        return Uri.parse(c(str, z, false)).getQueryParameter("clickid");
    }
}
