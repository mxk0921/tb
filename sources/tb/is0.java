package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.AlimamaAdvertising;
import com.taobao.alimama.click.applink.ApplinkClickBuilder;
import com.taobao.alimama.click.cpc.CpcClickBuilder;
import com.taobao.alimama.click.cpm.CpmClickBuilder;
import com.taobao.alimama.click.cps.CpsClickBuilder;
import com.taobao.alimama.click.extend.ExtendClickLink;
import com.taobao.alimama.click.extend.cpm.ExtendCpmClickBuilder;
import com.taobao.alimama.utils.UserTrackLogs;
import com.taobao.orange.OrangeConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class is0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static volatile is0 f21542a = new is0();

        static {
            t2o.a(1021313029);
        }
    }

    static {
        t2o.a(1021313028);
    }

    public static is0 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (is0) ipChange.ipc$dispatch("6c333c58", new Object[0]);
        }
        return a.f21542a;
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
        if (encodedQuery == null || encodedQuery.trim().length() == 0) {
            return uri;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : encodedQuery.split("&")) {
            if (str != null && !str.startsWith(js0.E_URL) && !str.startsWith("etype")) {
                sb.append(str);
                sb.append("&");
            }
        }
        String sb2 = sb.toString();
        if (sb2.length() > 0 && sb2.endsWith("&")) {
            sb2 = sb2.substring(0, sb2.length() - 1);
        }
        Uri.Builder buildUpon = uri.buildUpon();
        if (sb2.length() > 0) {
            buildUpon.encodedQuery(sb2.concat("&ad_type=1.0"));
        }
        return buildUpon.build();
    }

    public String c(String str) {
        Uri uri;
        String str2;
        String queryParameter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a07cb228", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Uri parse = Uri.parse(str);
        boolean isHierarchical = parse.isHierarchical();
        if (str.startsWith(itw.URL_SEPARATOR)) {
            parse = Uri.parse("http:".concat(str));
        }
        try {
            if ("on".equals(OrangeConfig.getInstance().getConfig("alimama_ad", "tk_cps_param_switch", "on")) && parse.isHierarchical() && (queryParameter = parse.getQueryParameter("tk_cps_param")) != null) {
                AlimamaAdvertising.instance().parseTkCpsAdParameters(queryParameter);
            }
        } catch (Exception unused) {
        }
        String queryParameter2 = parse.getQueryParameter(js0.E_URL);
        String queryParameter3 = parse.getQueryParameter("etype");
        if (TextUtils.isEmpty(queryParameter2) || TextUtils.isEmpty(queryParameter3)) {
            if (vm2.s("externalFlowIntercept")) {
                String queryParameter4 = parse.getQueryParameter(wll.ALI_TRACK_ID);
                String queryParameter5 = parse.getQueryParameter("clickid");
                if (!TextUtils.isEmpty(queryParameter4) && TextUtils.isEmpty(queryParameter5)) {
                    uri = Uri.parse(new ApplinkClickBuilder(parse.toString()).withArgIsOpenPage(true).commitAndAppendClickid(parse.toString()));
                }
            }
            uri = null;
        } else {
            Uri parse2 = Uri.parse(queryParameter2);
            if (!vm2.p() || !parse2.isHierarchical()) {
                str2 = "";
            } else {
                str2 = parse2.getQueryParameter("eadt");
            }
            try {
                String queryParameter6 = parse.getQueryParameter("acttype");
                if (!TextUtils.isEmpty(queryParameter6) && parse2.isHierarchical()) {
                    queryParameter2 = parse2.buildUpon().appendQueryParameter("atype", queryParameter6).toString();
                    i4g.a("append_eurl_acttype", "eurl = " + queryParameter2 + ", url = " + str);
                }
            } catch (Exception e) {
                UserTrackLogs.trackAdLog("append_eurl_acttype", z9u.ARG_TAOKE_ERROR + e.getMessage());
            }
            if ("1".equals(queryParameter3)) {
                parse = Uri.parse(new CpcClickBuilder(queryParameter2).withArgAUrl(parse.toString()).withArgEadt(str2).withArgIsOpenPage(true).commitAndAppendClickid(parse.toString()));
            } else if ("2".equals(queryParameter3)) {
                if (!TextUtils.equals("on", OrangeConfig.getInstance().getConfig("alimama_ad", "tk_cps_url_track_switch", "on"))) {
                    return str;
                }
                parse = new CpsClickBuilder().commitAndAppendClickid(queryParameter2, parse);
            } else if ("3".equals(queryParameter3)) {
                parse = Uri.parse(new CpmClickBuilder(queryParameter2).withArgAUrl(parse.toString()).withArgEadt(str2).withArgIsOpenPage(true).commitAndAppendClickid(parse.toString()));
            } else {
                ExtendClickLink b = com.taobao.alimama.click.extend.a.c().b(queryParameter3);
                if (b != null && b.a() == ExtendClickLink.CustomClickType.CPM) {
                    b.d(queryParameter2);
                    parse = Uri.parse(new ExtendCpmClickBuilder(queryParameter2).withArgAUrl(parse.toString()).withArgEadt(str2).withArgIsOpenPage(true).withExtendLink(b).commitAndAppendClickid(parse.toString()));
                }
            }
            uri = a(parse);
        }
        if (uri == null) {
            return str;
        }
        if (!isHierarchical) {
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.scheme(null);
            uri = buildUpon.build();
        }
        return uri.toString();
    }
}
