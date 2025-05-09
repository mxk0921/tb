package androidx.appcompat.taobao;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TBActionBar {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public enum ActionBarStyle {
        DARK,
        NORMAL;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(ActionBarStyle actionBarStyle, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/appcompat/taobao/TBActionBar$ActionBarStyle");
        }

        public static ActionBarStyle valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ActionBarStyle) ipChange.ipc$dispatch("7fda44d4", new Object[]{str});
            }
            return (ActionBarStyle) Enum.valueOf(ActionBarStyle.class, str);
        }
    }

    static {
        t2o.a(927989761);
    }
}
