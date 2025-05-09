package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.utils.HomeOptimizeUtils;
import tb.hfc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class j0b extends jgt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements HomeOptimizeUtils.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f21687a;
        public final /* synthetic */ String b;

        public a(Context context, String str) {
            this.f21687a = context;
            this.b = str;
        }

        @Override // com.taobao.homepage.utils.HomeOptimizeUtils.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("39174778", new Object[]{this});
            } else {
                j0b.f(j0b.this, this.f21687a, this.b);
            }
        }
    }

    static {
        t2o.a(729809598);
    }

    public static /* synthetic */ boolean f(j0b j0bVar, Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba9dd07e", new Object[]{j0bVar, context, str})).booleanValue();
        }
        return super.b(context, str);
    }

    public static /* synthetic */ Object ipc$super(j0b j0bVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1898337596) {
            return new Boolean(j0bVar.e((Context) objArr[0], (hfc.b) objArr[1], (String) objArr[2]));
        }
        if (hashCode == 1209916318) {
            return new Boolean(super.b((Context) objArr[0], (String) objArr[1]));
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/infoflow/scene/homemainland/config/HomeInfoFlowNav");
    }

    @Override // tb.jgt, tb.hfc
    public boolean b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("481ddb9e", new Object[]{this, context, str})).booleanValue();
        }
        HomeOptimizeUtils.a(context, new a(context, str));
        return true;
    }
}
