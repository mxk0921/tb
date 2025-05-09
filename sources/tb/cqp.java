package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.triver.triver_shop.newShop.ShopActivity;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import java.util.HashMap;
import kotlin.jvm.internal.Ref$BooleanRef;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class cqp {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final cqp INSTANCE = new cqp();

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<Long, a> f17235a = new HashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface a {
        void a(Intent intent);

        void b(Intent intent);

        Intent getData();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Intent f17236a;

        public b(Intent intent, Ref$BooleanRef ref$BooleanRef) {
            this.f17236a = intent;
        }

        @Override // tb.cqp.a
        public void a(Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8d350231", new Object[]{this, intent});
            } else {
                ckf.g(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
            }
        }

        @Override // tb.cqp.a
        public void b(Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("440b0040", new Object[]{this, intent});
            } else {
                ckf.g(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
            }
        }

        @Override // tb.cqp.a
        public Intent getData() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Intent) ipChange.ipc$dispatch("78f0a48c", new Object[]{this});
            }
            return this.f17236a;
        }
    }

    static {
        t2o.a(766510153);
    }

    public static /* synthetic */ void c(cqp cqpVar, Intent intent, boolean z, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896559b", new Object[]{cqpVar, intent, new Boolean(z), new Integer(i), obj});
            return;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        cqpVar.b(intent, z);
    }

    public final Intent a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("55341676", new Object[]{this, new Long(j)});
        }
        a remove = f17235a.remove(Long.valueOf(j));
        if (remove == null) {
            return null;
        }
        return remove.getData();
    }

    public final void e(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98ce7680", new Object[]{this, new Long(j)});
        } else {
            f17235a.remove(Long.valueOf(j));
        }
    }

    public final void f(long j, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b9c7dc", new Object[]{this, new Long(j), aVar});
            return;
        }
        ckf.g(aVar, "shopPrePushAcDataGetter");
        f17235a.put(Long.valueOf(j), aVar);
    }

    public final void d(Context context, long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12fecb59", new Object[]{this, context, new Long(j), str});
            return;
        }
        ckf.g(context, "context");
        ckf.g(str, mop.KEY_APM_SHOP_URL);
        Intent intent = new Intent();
        intent.putExtra(RVConstants.EXTRA_START_TOKEN, j);
        intent.putExtra(mop.KEY_ENABLE_DIRECTLY_PUSH_AC, true);
        intent.putExtra(mop.KEY_FIRST_IN_SHOP_URL, str);
        intent.setClass(context, ShopActivity.class);
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        context.startActivity(intent);
    }

    public final void b(Intent intent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48f9d08b", new Object[]{this, intent, new Boolean(z)});
            return;
        }
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ref$BooleanRef.element = z;
        String str = null;
        Bundle extras = intent == null ? null : intent.getExtras();
        if (intent != null) {
            str = intent.getStringExtra("targetUrl");
        }
        long j = extras == null ? 0L : extras.getLong(mop.KEY_APP_START, 0L);
        if (j == 0) {
            ref$BooleanRef.element = false;
        }
        if (str == null || str.length() == 0) {
            ref$BooleanRef.element = false;
        }
        Intent intent2 = new Intent();
        if (extras != null) {
            intent2.putExtras(extras);
        }
        if (str != null) {
            intent2.setData(Uri.parse(str));
        }
        intent2.putExtra(mop.KEY_ENABLE_DIRECTLY_PUSH_AC, true);
        HashMap<Long, a> hashMap = f17235a;
        a remove = hashMap.remove(Long.valueOf(j));
        if (remove == null) {
            hashMap.put(Long.valueOf(j), new b(intent2, ref$BooleanRef));
        } else if (ref$BooleanRef.element) {
            remove.a(intent2);
        } else {
            remove.b(intent2);
        }
    }
}
