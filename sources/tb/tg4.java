package tb;

import android.preference.PreferenceManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.update.framework.UpdateRuntime;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class tg4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public df4 f28702a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final tg4 f28703a = new tg4();

        static {
            t2o.a(947912709);
        }

        public static /* synthetic */ tg4 access$000() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (tg4) ipChange.ipc$dispatch("b4b3de76", new Object[0]);
            }
            return f28703a;
        }
    }

    static {
        t2o.a(947912707);
    }

    public static tg4 getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tg4) ipChange.ipc$dispatch("73ce197b", new Object[0]);
        }
        return b.access$000();
    }

    public void init(df4 df4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f0ee691", new Object[]{this, df4Var});
        } else {
            this.f28702a = df4Var;
        }
    }

    public tg4() {
    }

    public boolean enableDialogUiV2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a213da86", new Object[]{this})).booleanValue();
        }
        return "taobao4android".equals(this.f28702a.group) && "true".equals(PreferenceManager.getDefaultSharedPreferences(UpdateRuntime.getContext()).getString(gjv.UPDATE_DIALOG_UI_V2, "true")) && this.f28702a.enableDialogUiV2;
    }
}
