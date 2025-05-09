package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.r;
import com.taobao.avplayer.s;
import com.taobao.tao.Globals;
import com.taobao.taobaoavsdk.cache.library.StorageUtils;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ncw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f24651a = "VideoUtil";

    static {
        t2o.a(491782195);
    }

    public static String a(String str) {
        byte[] digest;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a46456c7", new Object[]{str});
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : instance.digest()) {
                sb.append(Integer.toHexString((b >> 4) & 15));
                sb.append(Integer.toHexString(b & 15));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3848e5c9", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String str2 = c() + a(str);
        if (TextUtils.isEmpty(str2)) {
            fve.e(f24651a, "getVideoFilePath empty");
        }
        return str2;
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c00032d1", new Object[0]);
        }
        return StorageUtils.getIndividualCacheDirectory(Globals.getApplication()).getAbsolutePath() + File.separator;
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d599f0b7", new Object[0])).booleanValue();
        }
        return !TextUtils.equals("l", sue.a());
    }

    public static boolean e(Context context) {
        j9t e;
        dhb b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cf278465", new Object[]{context})).booleanValue();
        }
        if (!d() || (e = j9t.e(context, "homepage")) == null || (b = e.b()) == null) {
            return false;
        }
        return b.isAutoPlayVideoUnderCurrentNetwork(context);
    }

    public static boolean f(r rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("516702fa", new Object[]{rVar})).booleanValue();
        }
        if (rVar != null && rVar.H() == 2) {
            return true;
        }
        return false;
    }

    public static boolean g(r rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e82936df", new Object[]{rVar})).booleanValue();
        }
        if (rVar != null && rVar.H() == 1) {
            return true;
        }
        return false;
    }

    public static boolean h(s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c3afd64d", new Object[]{sVar})).booleanValue();
        }
        if (sVar != null && sVar.m(1500) == 1) {
            return true;
        }
        return false;
    }
}
