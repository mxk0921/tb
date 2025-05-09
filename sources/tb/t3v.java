package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.internal.usertrack.UserTrackDO;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class t3v extends egu<UserTrackDO, UserTrackDO, u6n> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1034944732);
    }

    public t3v(String str, s3v s3vVar, u6n u6nVar, String str2) {
        super(str, s3vVar, u6nVar, str2);
    }

    public static /* synthetic */ Object ipc$super(t3v t3vVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/tmall/android/dai/trigger/protocol/UTTriggerProtocol");
    }

    @Override // tb.egu
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b0964297", new Object[]{this});
        }
        return ((u6n) this.b).c();
    }

    /* renamed from: f */
    public UserTrackDO a(UserTrackDO userTrackDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UserTrackDO) ipChange.ipc$dispatch("6dec3603", new Object[]{this, userTrackDO});
        }
        return userTrackDO;
    }

    /* renamed from: g */
    public String e(UserTrackDO userTrackDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b21f26a1", new Object[]{this, userTrackDO});
        }
        return userTrackDO.getSummary();
    }
}
