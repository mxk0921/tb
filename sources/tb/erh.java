package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.refactor.HalfStickySearchBarBehavior;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class erh extends leq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815792861);
    }

    public static /* synthetic */ Object ipc$super(erh erhVar, String str, Object... objArr) {
        if (str.hashCode() == -1259098756) {
            return super.a((String) objArr[0], (View) objArr[1], ((Boolean) objArr[2]).booleanValue(), ((Number) objArr[3]).intValue());
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/refactor/MSBehaviorCreator");
    }

    @Override // tb.leq, tb.zib
    public kr1 a(String str, View view, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kr1) ipChange.ipc$dispatch("b4f3ad7c", new Object[]{this, str, view, new Boolean(z), new Integer(i)});
        }
        ckf.g(str, "type");
        ckf.g(view, "view");
        kr1 a2 = super.a(str, view, z, i);
        if (a2 != null) {
            return a2;
        }
        int hashCode = str.hashCode();
        if (hashCode != -868071810) {
            if (hashCode != -554140606) {
                if (hashCode == 2063271543 && str.equals(ytc.TYPE_HALF_STICKY_SEARCHBAR)) {
                    return new HalfStickySearchBarBehavior(view, z, i);
                }
                return null;
            } else if (!str.equals("topHeader")) {
                return null;
            } else {
                return new ltg(view, z, i, new zwm(1000, 1001, 1000));
            }
        } else if (!str.equals("topBar")) {
            return null;
        } else {
            return new sra(view, new zwm(3000, 1000, 2000));
        }
    }
}
