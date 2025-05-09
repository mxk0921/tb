package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.alibaba.wireless.security.open.dynamicdataencrypt.IDynamicDataEncryptComponent;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class a09 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_MEMBERS = "familyMembers_";

    /* renamed from: a  reason: collision with root package name */
    public final IDynamicDataEncryptComponent f15465a;

    public a09(Context context) {
        try {
            SecurityGuardManager instance = SecurityGuardManager.getInstance(context);
            if (instance != null) {
                this.f15465a = instance.getDynamicDataEncryptComp();
            }
        } catch (SecException e) {
            e.printStackTrace();
        }
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("98bb6cdb", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return b(KEY_MEMBERS + str);
    }

    public String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ba42c148", new Object[]{this, str});
        }
        if (this.f15465a == null) {
            return "";
        }
        String b = vlp.b(str);
        if (TextUtils.isEmpty(b)) {
            return "";
        }
        try {
            return this.f15465a.dynamicDecryptDDp(b);
        } catch (SecException e) {
            e.printStackTrace();
            return "";
        }
    }

    public boolean c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c3a0f6da", new Object[]{this, str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        return d(KEY_MEMBERS + str2, str);
    }

    public boolean d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb567a1f", new Object[]{this, str, str2})).booleanValue();
        }
        if (this.f15465a != null && !TextUtils.isEmpty(str2)) {
            try {
                String dynamicEncryptDDp = this.f15465a.dynamicEncryptDDp(str2);
                if (TextUtils.isEmpty(dynamicEncryptDDp)) {
                    return false;
                }
                vlp.c(str, dynamicEncryptDDp);
                return true;
            } catch (SecException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
