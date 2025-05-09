package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel;
import com.taobao.infoflow.protocol.subservice.biz.ICardOverlayService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class r66 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_OPENHOSTTARGETURLHANDLER = -7373714118674621824L;

    /* renamed from: a  reason: collision with root package name */
    public v12 f27137a;

    static {
        t2o.a(491782475);
    }

    public static /* synthetic */ Object ipc$super(r66 r66Var, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/biz/overlayservice/impl/feedback/dxview/event/DXOpenHostTargetURLHandlerEventHandler");
    }

    public v12 a(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v12) ipChange.ipc$dispatch("ab852b3", new Object[]{this, cfcVar});
        }
        if (this.f27137a == null) {
            this.f27137a = new wbn(cfcVar);
        }
        return this.f27137a;
    }

    @Override // tb.ob5, tb.mvb
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
        } else {
            super.prepareBindEventWithArgs(objArr, dXRuntimeContext);
        }
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        cfc c;
        ICardOverlayService iCardOverlayService;
        BaseSectionModel<?> findHostCard;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        BaseSectionModel<?> baseSectionModel = (BaseSectionModel) dXRuntimeContext.i();
        if (baseSectionModel != null && (c = j18.c(dXRuntimeContext)) != null && (iCardOverlayService = (ICardOverlayService) c.a(ICardOverlayService.class)) != null && (findHostCard = iCardOverlayService.findHostCard(baseSectionModel)) != null && findHostCard.getItem() != null) {
            IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) c.a(IMainFeedsViewService.class);
            if (iMainFeedsViewService.findItemViewByPosition(iMainFeedsViewService.getPositionBySectionBizCode(findHostCard.getSectionBizCode())) != null) {
                BaseSubItemModel baseItemModel = findHostCard.getItem().getBaseItemModel(0);
                if (baseItemModel == null) {
                    fve.e("DXOpenHostTargetURLHandlerEventHandler", "subItemModel == null");
                    return;
                }
                vve.e(findHostCard, baseItemModel);
                a(c).d(findHostCard, baseItemModel, dXRuntimeContext.L());
            }
        }
    }
}
