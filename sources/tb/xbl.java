package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class xbl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String KEY_DETAIL_PAGE_CONTENT_LIST = "detail_page_content_list";
    public static final String KEY_TB_PROMOTION_CONTENT_LIST = "tb_promotion_content_list";
    public static final String ORANGE_NAMESPACE = "promotion_Android";
    public static final String VALUE_DEFAULT_DETAIL_PAGE_CONTENT_LIST = "{\"name\": \"detail_page_content_list\",\"version\": \"105\", \"url\": \"https://dinamicx.alibabausercontent.com/l_pub/detail_page_content_list/1732074247985/detail_page_content_list.zip\"}";
    public static final String VALUE_TB_PROMOTION_CONTENT_LIST = "{\"name\": \"tb_promotion_content_list\",\"version\": \"20\", \"url\": \"https://dinamicx.alibabausercontent.com/l_pub/tb_promotion_content_list/1733819590510/tb_promotion_content_list.zip\"}";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(629145662);
        }

        public a() {
        }

        @JvmStatic
        public final boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("787eadbc", new Object[]{this})).booleanValue();
            }
            return TextUtils.equals(OrangeConfig.getInstance().getConfig(xbl.ORANGE_NAMESPACE, "enableStatDetailContent", "true"), "true");
        }

        @JvmStatic
        public final JSONObject b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("5d5ff31", new Object[]{this});
            }
            try {
                return JSON.parseObject(OrangeConfig.getInstance().getConfig(xbl.ORANGE_NAMESPACE, xbl.KEY_DETAIL_PAGE_CONTENT_LIST, xbl.VALUE_DEFAULT_DETAIL_PAGE_CONTENT_LIST));
            } catch (Exception unused) {
                return JSON.parseObject(xbl.VALUE_DEFAULT_DETAIL_PAGE_CONTENT_LIST);
            }
        }

        @JvmStatic
        public final JSONObject c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("be012b0f", new Object[]{this});
            }
            try {
                return JSON.parseObject(OrangeConfig.getInstance().getConfig(xbl.ORANGE_NAMESPACE, xbl.KEY_TB_PROMOTION_CONTENT_LIST, xbl.VALUE_TB_PROMOTION_CONTENT_LIST));
            } catch (Exception unused) {
                return JSON.parseObject(xbl.VALUE_TB_PROMOTION_CONTENT_LIST);
            }
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(629145661);
    }

    @JvmStatic
    public static final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("787eadbc", new Object[0])).booleanValue();
        }
        return Companion.a();
    }

    @JvmStatic
    public static final JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5d5ff31", new Object[0]);
        }
        return Companion.b();
    }

    @JvmStatic
    public static final JSONObject c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("be012b0f", new Object[0]);
        }
        return Companion.c();
    }
}
