package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class tqo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final List<String> f28887a = new ArrayList();

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("91d58ce9", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || !((ArrayList) f28887a).contains(str)) {
            return false;
        }
        return true;
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1167ead3", new Object[]{str});
            return;
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                float nextFloat = new Random(System.currentTimeMillis()).nextFloat();
                String[] split = str.split(",");
                if (split.length > 0) {
                    for (String str2 : split) {
                        String[] split2 = str2.split(":");
                        if (split2.length == 2 && nextFloat < Float.parseFloat(split2[1])) {
                            c(split2[0]);
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4677d8e7", new Object[]{str});
        } else if (!TextUtils.isEmpty(str)) {
            ((ArrayList) f28887a).add(str);
        }
    }
}
