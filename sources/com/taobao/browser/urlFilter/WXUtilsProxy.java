package com.taobao.browser.urlFilter;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.browser.utils.BrowserUtil;
import com.taobao.tao.util.Constants;
import com.taobao.wangxin.proxy.WangxinControlerProxy;
import com.taobao.wangxin.utils.WXConstantsOut;
import java.io.UnsupportedEncodingException;
import tb.cq1;
import tb.t2o;
import tb.yp1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WXUtilsProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(619708640);
    }

    public static boolean parseWwURl(Activity activity, String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("959863c3", new Object[]{activity, str})).booleanValue();
        }
        BrowserUtil.b("WXUtilsProxy", "parseWwURl", null, str, null);
        Uri parse = Uri.parse(str);
        String fragment = parse.getFragment();
        String str7 = "";
        if (!"h5.m.taobao.com".equals(parse.getHost()) || fragment == null || fragment.indexOf("dialog") < 0) {
            if ("im.m.taobao.com".equals(parse.getHost()) && parse.getPath() != null && parse.getPath().indexOf("ww_dialog") >= 0) {
                String queryParameter = parse.getQueryParameter(WXConstantsOut.TOUSER);
                String queryParameter2 = parse.getQueryParameter("shop_id");
                String queryParameter3 = parse.getQueryParameter("pay_order_id");
                try {
                    str2 = new String(cq1.a(queryParameter.getBytes()), Constants.DEFAULT_CHARSET);
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                    str2 = str7;
                }
                String queryParameter4 = parse.getQueryParameter("item_num_id");
                "toNick ".concat(str2);
                if (!TextUtils.isEmpty(str2)) {
                    WangxinControlerProxy.gotoWangxinChatWithFengliu(activity, str2, queryParameter4, queryParameter3, queryParameter2, null);
                    BrowserUtil.b("WXUtilsProxy", "parseWwURl", "wx_im", str, null);
                    return true;
                }
            }
            return false;
        }
        try {
            String[] split = fragment.split("-");
            if (split != null) {
                str5 = (split.length < 2 || (str6 = split[1]) == null) ? str7 : yp1.b(str6.getBytes());
                str4 = (split.length < 3 || split[2].length() <= 1) ? str7 : split[2];
                str3 = (split.length < 4 || split[3].length() <= 1) ? str7 : split[3];
                if (split.length >= 5 && split[4].length() > 1) {
                    str7 = split[4];
                }
            } else {
                str5 = str7;
                str4 = str5;
                str7 = str4;
                str3 = str7;
            }
            if (!TextUtils.isEmpty(str5)) {
                WangxinControlerProxy.gotoWangxinChatWithFengliu(activity, str5, str4, str7, str3, null);
                BrowserUtil.b("WXUtilsProxy", "parseWwURl", "wx_h5", str, null);
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
