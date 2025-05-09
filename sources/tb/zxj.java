package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.utils.lang3.ObjectUtils;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.taobao.subservice.biz.nextpageoptimizeservice.impl.preload.model.PreLoadModel;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class zxj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(491782428);
    }

    public void a(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2221bd82", new Object[]{this, iContainerDataModel});
        } else if (!gyj.a(iContainerDataModel)) {
            fve.e("NewDetailOnLayPagePreLoader", "clearDataSource 未开启 NewDetail 预加载");
        } else {
            eyj.b(new PreLoadModel());
        }
    }

    public void b(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc9e9668", new Object[]{this, iContainerDataModel});
        } else if (!gyj.a(iContainerDataModel)) {
            fve.e("NewDetailOnLayPagePreLoader", "preLoadNewDetailOnLayPage 未开启 NewDetail 预加载");
        } else {
            PreLoadModel c = c(iContainerDataModel);
            if (c == null) {
                fve.e("NewDetailOnLayPagePreLoader", "preLoadNewDetailOnLayPage preLoadModel is null");
            } else {
                eyj.c(c);
            }
        }
    }

    public final PreLoadModel c(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PreLoadModel) ipChange.ipc$dispatch("a4386d0b", new Object[]{this, iContainerDataModel});
        }
        if (iContainerDataModel == null) {
            fve.e("NewDetailOnLayPagePreLoader", "preparePreLoadModelOnLayPage containerDataService is null");
            return null;
        }
        IContainerInnerDataModel<?> base = iContainerDataModel.getBase();
        if (base == null) {
            fve.e("NewDetailOnLayPagePreLoader", "preparePreLoadModelOnLayPage baseData is null");
            return null;
        } else if (base.getPageParams() == null || base.getPageParams().getPageNum() == 0) {
            fve.e("NewDetailOnLayPagePreLoader", "preparePreLoadModelOnLayPage 分页数据不满足预请求条件");
            return null;
        } else {
            List<?> sections = base.getSections();
            if (!ObjectUtils.c(sections)) {
                return fnm.d(sections, base.getPageParams().getPageNum(), "newDetail", "InfoFlow");
            }
            fve.e("NewDetailOnLayPagePreLoader", "preparePreLoadModelOnLayPage sectionModels isEmpty");
            return null;
        }
    }
}
