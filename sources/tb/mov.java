package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class mov {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(619708655);
    }

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c25c2d20", new Object[]{str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        return Pattern.matches(str, str2);
    }

    public static boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eed7def", new Object[]{str, str2})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                List parseArray = JSON.parseArray(str, String.class);
                for (int i = 0; i < parseArray.size(); i++) {
                    if (!((String) parseArray.get(i)).isEmpty() && str2.contains((CharSequence) parseArray.get(i))) {
                        return true;
                    }
                }
                return false;
            } catch (JSONException e) {
                TLog.logd(kov.TAG, e.getMessage());
            }
        }
        return false;
    }
}
