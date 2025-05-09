package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.uikit.extend.iconfont.utils.IconfontApi;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class jm0 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long PARSER_ID = -4218920722952897909L;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, String[]> f22064a;

    public static /* synthetic */ Object ipc$super(jm0 jm0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/buy/dinamicX/parser/AliBuyDataParserGetIconFont");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length == 0 || (strArr = (String[]) ((HashMap) f22064a).get((String) objArr[0])) == null) {
            return null;
        }
        String iconfont = IconfontApi.getIconfont(strArr[0], null);
        if (TextUtils.isEmpty(iconfont)) {
            return null;
        }
        strArr[0] = iconfont;
        return Arrays.asList(strArr);
    }

    static {
        t2o.a(301989916);
        HashMap hashMap = new HashMap();
        f22064a = hashMap;
        hashMap.put("O1CN01qmnQ6k1muSrrdQQe6_!!6000000005014", new String[]{"tb_LocationOutlined", "#11192D"});
        hashMap.put("O1CN01hriht01i2drNwH6P2_!!6000000004355", new String[]{"tb_LocationOutlined", "#FFFFFF"});
        hashMap.put("O1CN01VaR0Wk1I16Wdt22tm_!!6000000000832", new String[]{"tb_LocationOutlined", "#FF6200"});
        hashMap.put("O1CN017crHsN1vIknvwCKox_!!6000000006150", new String[]{"tb_RoundaddOutlined", "#11192D"});
        hashMap.put("O1CN01m2sRaH1XBNeK1oYnl_!!6000000002885", new String[]{"tb_RoundaddOutlined", "#FFFFFF"});
        hashMap.put("O1CN01U3YAd81ya6eo6kbh4_!!6000000006594", new String[]{"tb_GiftboxOutlined", "#11192D"});
        hashMap.put("O1CN01HBrFab1zo8P7up9I5_!!6000000006760", new String[]{"tb_GiftboxOutlined", "#FFFFFF"});
        hashMap.put("O1CN01V0K1ok1LpQtcUG09w_!!6000000001348", new String[]{"tb_RoundcloseOutlined", "#50607A"});
        hashMap.put("1CN01agSeJL1yGPcvEu3J8_!!6000000006551", new String[]{"tb_RoundcloseOutlined", "#CACFD7"});
        hashMap.put("O1CN01n8eXHH1RlfKkNXWbW_!!6000000002152", new String[]{"tb_ContactOutlined", "#11192D"});
        hashMap.put("O1CN01M9IgBv1FY8ExyjMZm_!!6000000000498", new String[]{"tb_ContactOutlined", "#FFFFFF"});
        hashMap.put("O1CN01RBEWz329Asbs6AwkZ_!!6000000008028", new String[]{"tb_PhoneFilled", "#11192D"});
        hashMap.put("O1CN01XDxgHi1l9v0Xg3fmX_!!6000000004777", new String[]{"tb_PhoneFilled", "#FFFFFF"});
        hashMap.put("O1CN01dndJ0V1cDHN8VPJ6R_!!6000000003566", new String[]{"tb_QuestionOutlined", "#CACFD7"});
        hashMap.put("O1CN01KG8veK1r0CIRD8Cig_!!6000000005568", new String[]{"tb_Change", "#CACFD7"});
        hashMap.put("O1CN01BQr4xR1tDb782FIQy_!!6000000005868", new String[]{"tb_Minus", "#CACFD7"});
        hashMap.put("O1CN015vXavG1jvQrcIItRC_!!6000000004610", new String[]{"tb_Minus", "#11192D"});
        hashMap.put("O1CN01df48kn1Xm1Ktm1tzL_!!6000000002965", new String[]{"tb_add", "#CACFD7"});
        hashMap.put("O1CN01WnG3Od25Pl1I5EFH4_!!6000000007519", new String[]{"tb_add", "#11192D"});
        hashMap.put("O1CN01V47SjA1C8zf2RcFd0_!!6000000000037", new String[]{"tb_Back", "#11192D"});
        hashMap.put("O1CN01AhB0bs1eEltkwoFpA_!!6000000003840", new String[]{"tb_Back", "#FFFFFF"});
        hashMap.put("O1CN01qjvToS1dJ3zbnGIZJ_!!6000000003714", new String[]{"tb_RoundalertOutlined", "#7C889C"});
        hashMap.put("O1CN01szkl9u1YURl9swRxL_!!6000000003062", new String[]{"tb_RoundalertOutlined", "#FF6200"});
        hashMap.put("O1CN01GPKEbY1lxNmrGvjCB_!!6000000004885", new String[]{"tb_ArrowDownFilled", "#7C889C"});
    }
}
