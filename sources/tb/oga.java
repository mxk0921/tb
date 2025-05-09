package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class oga {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_MAIN_IMAGE_URL = "checkMainImageUrl";
    public static final String KEY_MAIN_TITLE = "checkMainTitle";
    public static final String KEY_PRICE = "checkPrice";

    static {
        t2o.a(486539521);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c5459eee", new Object[]{str});
        }
        JSONObject parseObject = JSON.parseObject(str);
        String string = parseObject.getString(pg1.ATOM_symbol);
        String str2 = "";
        if (string == null) {
            string = str2;
        }
        String string2 = parseObject.getString("yuan");
        if (string2 == null) {
            string2 = str2;
        }
        String string3 = parseObject.getString("separator");
        if (string3 == null) {
            string3 = str2;
        }
        String string4 = parseObject.getString("cent");
        if (string4 == null) {
            string4 = str2;
        }
        String string5 = parseObject.getString(mh1.PRICE_UNIT);
        if (string5 != null) {
            str2 = string5;
        }
        return string + string2 + string3 + string4 + str2;
    }

    public static void b(BaseSectionModel<?> baseSectionModel) {
        JSONObject ext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75f2e776", new Object[]{baseSectionModel});
        } else if (baseSectionModel != null && (ext = baseSectionModel.getExt()) != null && !TextUtils.equals("true", ext.getString("isCardSaved"))) {
            ext.put("isCardSaved", (Object) "true");
            String str = (String) kr8.b("item.0.smartContent.price.v", baseSectionModel);
            String str2 = (String) kr8.b("item.0.smartContent.main_title.v", baseSectionModel);
            String str3 = (String) kr8.b("item.0.smartContent.main_image.v", baseSectionModel);
            if (str3 == null) {
                str3 = (String) kr8.b("item.0.smartContent.main_image.image", baseSectionModel);
            }
            if (str2 == null) {
                str2 = (String) kr8.b("item.0.content.title", baseSectionModel);
            }
            if (str3 == null) {
                str3 = (String) kr8.b("item.0.content.mainImg", baseSectionModel);
            }
            if (str == null) {
                str = (String) kr8.b("item.0.content.price", baseSectionModel);
            }
            if (str2 == null) {
                str2 = (String) kr8.b("item.0.content.main_title", baseSectionModel);
            }
            if (str3 == null) {
                str3 = (String) kr8.b("item.0.content.main_image", baseSectionModel);
            }
            if (str == null) {
                str = (String) kr8.b("item.0.content.price", baseSectionModel);
            }
            if (str2 == null) {
                str2 = (String) kr8.b("item.0.smartContent.main_title.v", baseSectionModel);
            }
            if (str3 == null) {
                str3 = (String) kr8.b("item.0.smartContent.main_image.v", baseSectionModel);
            }
            if (str == null) {
                str = (String) kr8.b("item.0.smartContent.price.v", baseSectionModel);
            }
            if (str != null) {
                ext.put(KEY_PRICE, (Object) a(str));
            }
            if (str2 != null) {
                ext.put(KEY_MAIN_TITLE, (Object) str2);
            }
            if (str3 != null) {
                ext.put(KEY_MAIN_IMAGE_URL, (Object) str3);
            }
        }
    }
}
