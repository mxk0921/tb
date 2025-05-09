package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.internal.usertrack.UserTrackDO;
import com.tmall.android.dai.trigger.TriggerMatchResult;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class n45 implements l45 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f24498a;
    public String b;
    public int c;
    public int d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f24499a;
        public final boolean b;
        public final boolean c;
        public final String d;

        static {
            t2o.a(1034944702);
        }

        public a(String str) {
            this.f24499a = str;
            this.d = str;
            if (TextUtils.isEmpty(str)) {
                this.b = false;
                this.c = false;
                return;
            }
            if (str.startsWith(f7l.MOD)) {
                this.d = str.substring(1);
                this.b = true;
            }
            if (this.d.endsWith(f7l.MOD)) {
                String str2 = this.d;
                this.d = str2.substring(0, str2.length() - 1);
                this.c = true;
            }
        }

        public String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("16d703df", new Object[]{this});
            }
            return this.d;
        }

        public boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e35c0d1f", new Object[]{this})).booleanValue();
            }
            if (this.b || this.c) {
                return true;
            }
            return false;
        }

        public boolean c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("705b429a", new Object[]{this, str})).booleanValue();
            }
            String str2 = this.d;
            if (str2 == null || str == null) {
                return false;
            }
            boolean z = this.b;
            if (z && this.c) {
                return str.contains(str2);
            }
            if (z) {
                return str.endsWith(str2);
            }
            if (this.c) {
                return str.startsWith(str2);
            }
            return str.equals(str2);
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "PatternMatcher{" + this.f24499a + "}";
        }
    }

    static {
        t2o.a(1034944701);
        t2o.a(1034944698);
    }

    public final boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47cbc75f", new Object[]{this, str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (TextUtils.equals(str.toLowerCase(), "${empty}")) {
            return TextUtils.isEmpty(str2);
        }
        if (TextUtils.equals(str.toLowerCase(), "${!empty}")) {
            return !TextUtils.isEmpty(str2);
        }
        return false;
    }

    public abstract ArrayList<String> b();

    public TriggerMatchResult c(UserTrackDO userTrackDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TriggerMatchResult) ipChange.ipc$dispatch("d2b9fe64", new Object[]{this, userTrackDO});
        }
        if (!a(this.b, userTrackDO.getOwnerId())) {
            return TriggerMatchResult.b(TriggerMatchResult.TriggerMatchResultCode.TRIGGER_MATCH_RESULT_CODE_UT_OWNER_NOT_MATCH, "");
        }
        if (this.f24498a != userTrackDO.getEventId()) {
            return TriggerMatchResult.b(TriggerMatchResult.TriggerMatchResultCode.TRIGGER_MATCH_RESULT_CODE_UT_EVENT_ID_NOT_MATCH, "eventId not matched");
        }
        return TriggerMatchResult.c();
    }
}
