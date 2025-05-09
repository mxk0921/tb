package tb;

import android.content.Context;
import android.preference.PreferenceManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tinct.model.ChangeType;
import com.taobao.tinct.model.InstantPatchChangeInfo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class h9f extends InstantPatchChangeInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public h9f(String str, String str2) {
        this.version = str;
        this.verType = str2;
        this.changeType = ChangeType.PATCH_INLINE;
    }

    public static String getPatchType(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fa18d18b", new Object[]{context});
        }
        return PreferenceManager.getDefaultSharedPreferences(context).getString("inlinepatch_effective_type", "");
    }

    public static String getPatchVersion(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1e63c105", new Object[]{context});
        }
        return PreferenceManager.getDefaultSharedPreferences(context).getString("inlinepatch_effective_version", "");
    }

    public static /* synthetic */ Object ipc$super(h9f h9fVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tinct/model/InlinePatchChangeInfo");
    }

    @Override // com.taobao.tinct.model.InstantPatchChangeInfo, com.taobao.tinct.model.BaseChangeInfo
    public String getTinctTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8f9becd3", new Object[]{this});
        }
        String str = this.version;
        return "escort|inline|" + str;
    }

    public h9f(String str, boolean z) {
        this(str, z ? InstantPatchChangeInfo.TYPE_BETA : InstantPatchChangeInfo.TYPE_RELEASE);
    }
}
