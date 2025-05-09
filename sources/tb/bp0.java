package tb;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.PhenixCreator;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import java.util.Map;
import tb.fwb;
import tb.y06;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class bp0 extends cp0 implements fwb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a<T extends b1m> implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ y06.g f16521a;

        public a(y06.g gVar) {
            this.f16521a = gVar;
        }

        /* renamed from: a */
        public final boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            y06.g gVar = this.f16521a;
            ckf.f(succPhenixEvent, "event");
            BitmapDrawable drawable = succPhenixEvent.getDrawable();
            ckf.f(drawable, "event.drawable");
            ((y06.e) gVar).a(drawable.getBitmap());
            return false;
        }
    }

    public static /* synthetic */ Object ipc$super(bp0 bp0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/AliDXNewRichTextImageImpl");
    }

    @Override // tb.fwb
    public void b(Context context, String str, fwb.a aVar, y06.g gVar) {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42d47392", new Object[]{this, context, str, aVar, gVar});
        } else if (!TextUtils.isEmpty(str) && gVar != null) {
            PhenixCreator succListener = s0m.B().T(str).succListener(new a(gVar));
            if (!(aVar == null || (map = aVar.f19577a) == null)) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    succListener.addLoaderExtra(entry.getKey(), entry.getValue());
                }
            }
            succListener.fetch();
        }
    }
}
