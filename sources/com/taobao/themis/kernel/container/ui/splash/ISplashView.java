package com.taobao.themis.kernel.container.ui.splash;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.eas;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface ISplashView {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class Status extends Enum<Status> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final Status LAUNCH = new Status("LAUNCH", 0);
        public static final Status LOADING = new Status("LOADING", 1);
        public static final Status ERROR = new Status("ERROR", 2);
        public static final Status EXIT = new Status("EXIT", 3);
        private static final /* synthetic */ Status[] $VALUES = $values();

        private static final /* synthetic */ Status[] $values() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Status[]) ipChange.ipc$dispatch("32f9d6bd", new Object[0]) : new Status[]{LAUNCH, LOADING, ERROR, EXIT};
        }

        private Status(String str, int i) {
        }

        public static /* synthetic */ Object ipc$super(Status status, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/kernel/container/ui/splash/ISplashView$Status");
        }

        public static Status valueOf(String str) {
            Object valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                valueOf = ipChange.ipc$dispatch("747d07b2", new Object[]{str});
            } else {
                valueOf = Enum.valueOf(Status.class, str);
            }
            return (Status) valueOf;
        }

        public static Status[] values() {
            Object clone;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                clone = ipChange.ipc$dispatch("e7b77561", new Object[0]);
            } else {
                clone = $VALUES.clone();
            }
            return (Status[]) clone;
        }
    }

    void a();

    void b(eas easVar, Map<String, String> map);

    void exit();

    Status getStatus();

    void showLoading();
}
