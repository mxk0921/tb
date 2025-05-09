package com.taobao.infoflow.protocol.subservice.biz;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.ISubService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface IUserExperienceCheckService extends ISubService {
    public static final String SERVICE_NAME = "IUserExperienceCheckService";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public enum CheckOccasion {
        EXPOSE,
        CLICK;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(CheckOccasion checkOccasion, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/protocol/subservice/biz/IUserExperienceCheckService$CheckOccasion");
        }

        public static CheckOccasion valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CheckOccasion) ipChange.ipc$dispatch("dd6ad913", new Object[]{str});
            }
            return (CheckOccasion) Enum.valueOf(CheckOccasion.class, str);
        }
    }

    void saveGoodsInfo(BaseSectionModel<?> baseSectionModel);

    void startExperienceCheckTask(BaseSectionModel<?> baseSectionModel, CheckOccasion checkOccasion);
}
