package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.FluidService;
import com.taobao.android.fluid.framework.DefaultFluidInstance;
import com.taobao.android.fluid.framework.card.ICardService;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.MediaContentDetailData;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.list.IFeedsListService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class ikf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final ikf INSTANCE = new ikf();
    public static final String TAG = "InvalidContentHelper";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FluidContext f21364a;
        public final /* synthetic */ Integer b;

        public a(FluidContext fluidContext, Integer num) {
            this.f21364a = fluidContext;
            this.b = num;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Integer num;
            IFeedsListService iFeedsListService;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ICardService iCardService = (ICardService) this.f21364a.getService(ICardService.class);
            if (iCardService != null) {
                num = Integer.valueOf(iCardService.getCurrentActiveCellPosition());
            } else {
                num = null;
            }
            ir9.b(ikf.TAG, "NewContentErrorStatus 延迟时间到，执行自动下滑，activePosition=" + num + "; currentIndex=" + this.b);
            if (ckf.b(num, this.b)) {
                FluidContext fluidContext = this.f21364a;
                if (((DefaultFluidInstance) fluidContext) != null && (iFeedsListService = (IFeedsListService) fluidContext.getService(IFeedsListService.class)) != null) {
                    iFeedsListService.publicNextVideo();
                }
            }
        }
    }

    static {
        t2o.a(468713931);
    }

    public final void a(FluidContext fluidContext, com.taobao.android.fluid.framework.data.datamodel.a aVar) {
        MediaContentDetailData.Content content;
        String str;
        String str2;
        a.d e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcd40c9e", new Object[]{this, fluidContext, aVar});
            return;
        }
        ckf.g(fluidContext, "fluidContext");
        if (hn4.b()) {
            Integer num = null;
            if (aVar == null || (e = aVar.e()) == null) {
                content = null;
            } else {
                content = e.e();
            }
            if (content != null) {
                str = content.errorType;
            } else {
                str = null;
            }
            if (content != null) {
                str2 = content.errorUtpairs;
            } else {
                str2 = null;
            }
            xau.V(fluidContext, str, str2);
            ir9.b(TAG, "NewContentErrorStatus 异常内容，即将执行自动下滑");
            DefaultFluidInstance defaultFluidInstance = (DefaultFluidInstance) fluidContext;
            IDataService iDataService = (IDataService) fluidContext.getService(IDataService.class);
            if (iDataService != null) {
                num = Integer.valueOf(iDataService.getIndexOfList(aVar));
            }
            FluidService service = fluidContext.getService(IDataService.class);
            ckf.d(service);
            int totalCount = ((IDataService) service).getTotalCount();
            ckf.d(num);
            if (num.intValue() < totalCount - 1) {
                ir9.b(TAG, "NewContentErrorStatus 存在下一坑内容，直接 执行自动下滑");
                IFeedsListService iFeedsListService = (IFeedsListService) fluidContext.getService(IFeedsListService.class);
                if (iFeedsListService != null) {
                    iFeedsListService.publicNextVideo();
                    return;
                }
                return;
            }
            int g = hn4.g();
            ir9.b(TAG, "NewContentErrorStatus 不存在下一坑内容，延后 执行自动下滑, delayTime=" + g);
            prp.mHandler.postDelayed(new a(fluidContext, num), (long) g);
        }
    }
}
