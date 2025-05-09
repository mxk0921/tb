package com.alibaba.ariver.app.api.ui.loading;

import com.alibaba.ariver.app.api.EntryInfo;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface SplashView {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface ExitListener {
        void onExit();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public enum Status {
        WAITING,
        LOADING,
        ERROR,
        EXIT;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(Status status, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ariver/app/api/ui/loading/SplashView$Status");
        }

        public static Status valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Status) ipChange.ipc$dispatch("d0e4788", new Object[]{str});
            }
            return (Status) Enum.valueOf(Status.class, str);
        }
    }

    boolean backPressed();

    void exit(ExitListener exitListener);

    Status getStatus();

    void showError(String str, String str2, Map<String, String> map);

    void showLoading(EntryInfo entryInfo);

    void update(EntryInfo entryInfo);
}
