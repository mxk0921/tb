package com.alibaba.wireless.security.open.middletier.fc;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class FCAction {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public enum FCMainAction {
        SUCCESS,
        FAIL,
        CANCEL,
        RETRY,
        TIMEOUT;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(FCMainAction fCMainAction, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/wireless/security/open/middletier/fc/FCAction$FCMainAction");
        }

        public static FCMainAction valueOf(String str) {
            Object valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                valueOf = ipChange.ipc$dispatch("a4d0a70f", new Object[]{str});
            } else {
                valueOf = Enum.valueOf(FCMainAction.class, str);
            }
            return (FCMainAction) valueOf;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public enum FCSubAction {
        WUA(1),
        NC(2),
        FL(4),
        LOGIN(8),
        DENY(16);
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private long f3439a;

        FCSubAction(long j) {
            this.f3439a = j;
        }

        public static /* synthetic */ Object ipc$super(FCSubAction fCSubAction, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/wireless/security/open/middletier/fc/FCAction$FCSubAction");
        }

        public static FCSubAction valueOf(String str) {
            Object valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                valueOf = ipChange.ipc$dispatch("7c3547c2", new Object[]{str});
            } else {
                valueOf = Enum.valueOf(FCSubAction.class, str);
            }
            return (FCSubAction) valueOf;
        }

        public long getValue() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d1b766b6", new Object[]{this})).longValue();
            }
            return this.f3439a;
        }
    }

    static {
        t2o.a(659554378);
    }
}
