package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliConfigInterface;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class acl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d3b1054", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b != null) {
            return TextUtils.equals(b.getConfig("nextrpc", "isMatchSuccessStr", "true"), Boolean.TRUE.toString());
        }
        return true;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b4804349", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b != null) {
            return TextUtils.equals(b.getConfig("nextrpc", "isFixedTaskDeadlock", "true"), Boolean.TRUE.toString());
        }
        return true;
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ff628e8", new Object[]{str})).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b != null) {
            try {
                return JSON.parseObject(b.getConfig("nextrpc", "useMtopRetCodeAndMsg", "{\"nextrpc-CARTS2\":\"true\"}")).getBooleanValue(str);
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
