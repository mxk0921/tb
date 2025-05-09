package tb;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.xiaomi.mipush.sdk.PushMessageHelper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class cdq extends bdq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f16995a;
    public final int b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    public final List g;
    public final List h;
    public final PendingIntent i;
    public final List<Parcelable> j;

    static {
        t2o.a(677380259);
    }

    public cdq(int i, int i2, int i3, int i4, long j, long j2, List<String> list, List<String> list2, PendingIntent pendingIntent, ArrayList<Parcelable> arrayList) {
        this(i, i2, i3, i4, j, j2, list, list2, pendingIntent, arrayList, "");
    }

    public static /* synthetic */ Object ipc$super(cdq cdqVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/split/core/splitinstall/SplitInstallSessionStateDetail");
    }

    public static bdq k(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bdq) ipChange.ipc$dispatch("b0c72c44", new Object[]{bundle});
        }
        return new cdq(bundle.getInt("session_id"), bundle.getInt("status"), bundle.getInt(PushMessageHelper.ERROR_TYPE), bundle.getInt("error_code"), bundle.getLong("bytes_downloaded"), bundle.getLong("total_bytes_to_download"), bundle.getStringArrayList("module_names"), bundle.getStringArrayList("languages"), (PendingIntent) bundle.getParcelable("user_confirmation_intent"), bundle.getParcelableArrayList("split_file_intents"), bundle.getString("args"));
    }

    @Override // tb.bdq
    public final long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("95ae616d", new Object[]{this})).longValue();
        }
        return this.e;
    }

    @Override // tb.bdq
    public final int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9702220f", new Object[]{this})).intValue();
        }
        return this.c;
    }

    @Override // tb.bdq
    public final int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a26e94dc", new Object[]{this})).intValue();
        }
        return this.d;
    }

    @Override // tb.bdq
    public final List d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("92f4f81f", new Object[]{this});
        }
        return this.j;
    }

    @Override // tb.bdq
    public final List e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("583692e5", new Object[]{this});
        }
        return this.h;
    }

    public final boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bdq)) {
            return false;
        }
        bdq bdqVar = (bdq) obj;
        if (this.f16995a != bdqVar.h() || this.b != bdqVar.i() || this.c != bdqVar.b() || this.e != bdqVar.a() || this.f != bdqVar.j()) {
            return false;
        }
        List list = this.g;
        if (list == null) {
            if (bdqVar.f() != null) {
                return false;
            }
        } else if (!list.equals(bdqVar.f())) {
            return false;
        }
        List list2 = this.h;
        if (list2 == null) {
            if (bdqVar.e() != null) {
                return false;
            }
        } else if (!list2.equals(bdqVar.e())) {
            return false;
        }
        PendingIntent pendingIntent = this.i;
        if (pendingIntent == null) {
            if (bdqVar.g() != null) {
                return false;
            }
        } else if (!pendingIntent.equals(bdqVar.g())) {
            return false;
        }
        List<Parcelable> list3 = this.j;
        if (list3 == null) {
            if (bdqVar.d() != null) {
                return false;
            }
        } else if (!list3.equals(bdqVar.d())) {
            return false;
        }
        return true;
    }

    @Override // tb.bdq
    public final List f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("35ff2924", new Object[]{this});
        }
        return this.g;
    }

    @Override // tb.bdq
    public final PendingIntent g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PendingIntent) ipChange.ipc$dispatch("b866179b", new Object[]{this});
        }
        return this.i;
    }

    @Override // tb.bdq
    public final int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e576324b", new Object[]{this})).intValue();
        }
        return this.f16995a;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        long j = this.e;
        long j2 = this.f;
        int i5 = (((((((((this.f16995a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        List list = this.g;
        if (list == null) {
            i = 0;
        } else {
            i = list.hashCode();
        }
        int i6 = (i5 ^ i) * 1000003;
        List list2 = this.h;
        if (list2 == null) {
            i2 = 0;
        } else {
            i2 = list2.hashCode();
        }
        int i7 = (i6 ^ i2) * 1000003;
        PendingIntent pendingIntent = this.i;
        if (pendingIntent == null) {
            i3 = 0;
        } else {
            i3 = pendingIntent.hashCode();
        }
        int i8 = (i7 ^ i3) * 1000003;
        List<Parcelable> list3 = this.j;
        if (list3 != null) {
            i4 = list3.hashCode();
        }
        return i4 ^ i8;
    }

    @Override // tb.bdq
    public final int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eb60b6c", new Object[]{this})).intValue();
        }
        return this.b;
    }

    @Override // tb.bdq
    public final long j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7a6b3e85", new Object[]{this})).longValue();
        }
        return this.f;
    }

    public final String toString() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        int i = this.f16995a;
        int i2 = this.b;
        int i3 = this.c;
        long j = this.e;
        int i4 = this.d;
        long j2 = this.f;
        String valueOf = String.valueOf(new ArrayList(this.g));
        if (this.j != null) {
            str = String.valueOf(new ArrayList(this.j));
        } else {
            str = "";
        }
        StringBuilder sb = new StringBuilder(valueOf.length() + 251 + str.length());
        sb.append("SplitInstallSessionState{sessionId=");
        sb.append(i);
        sb.append(", status=");
        sb.append(i2);
        sb.append(", errorCode=");
        sb.append(i3);
        sb.append(", errorType=");
        sb.append(i4);
        sb.append(", bytesDownloaded=");
        sb.append(j);
        sb.append(", totalBytesToDownload=");
        sb.append(j2);
        sb.append(", moduleNamesNullable=");
        sb.append(valueOf);
        sb.append(", splitFileIntents=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    public cdq(int i, int i2, int i3, int i4, long j, long j2, List<String> list, List<String> list2, PendingIntent pendingIntent, ArrayList<Parcelable> arrayList, String str) {
        this.f16995a = i;
        this.b = i2;
        this.d = i3;
        this.c = i4;
        this.e = j;
        this.f = j2;
        this.g = list;
        this.h = list2;
        this.i = pendingIntent;
        this.j = arrayList;
    }
}
