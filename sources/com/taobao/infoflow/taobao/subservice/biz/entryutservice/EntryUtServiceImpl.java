package com.taobao.infoflow.taobao.subservice.biz.entryutservice;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel;
import com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService;
import com.taobao.infoflow.protocol.subservice.biz.IEntryUtService;
import tb.cfc;
import tb.fve;
import tb.t2o;
import tb.yj4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class EntryUtServiceImpl implements IEntryUtService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "EntryUtServiceImpl";
    private IDxItemClickService mDxItemClickService;
    private IDxItemClickService.OnDxClickNavListener mOnDxClickNavListener;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements IDxItemClickService.OnDxClickNavListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(EntryUtServiceImpl entryUtServiceImpl) {
        }

        @Override // com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService.OnDxClickNavListener
        public void onNav(BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel, Bundle bundle, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc943dd5", new Object[]{this, baseSectionModel, baseSubItemModel, bundle, str});
                return;
            }
            try {
                Uri parse = Uri.parse(str);
                if (TextUtils.equals("true", parse.getQueryParameter("useEntryUtparam"))) {
                    bundle.putString("entryUtParam", parse.getQueryParameter(yj4.PARAM_UT_PARAMS));
                    bundle.putString("entrySpm", parse.getQueryParameter("spm"));
                    bundle.putString("entryScm", parse.getQueryParameter("scm"));
                }
            } catch (Exception e) {
                fve.e(EntryUtServiceImpl.TAG, Log.getStackTraceString(e));
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService.OnDxClickNavListener
        public void onNavFinished(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad70e197", new Object[]{this, new Boolean(z)});
            }
        }
    }

    static {
        t2o.a(491782325);
        t2o.a(488636555);
    }

    private IDxItemClickService.OnDxClickNavListener genNavListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDxItemClickService.OnDxClickNavListener) ipChange.ipc$dispatch("a833facf", new Object[]{this});
        }
        return new a(this);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
            return;
        }
        IDxItemClickService iDxItemClickService = (IDxItemClickService) cfcVar.a(IDxItemClickService.class);
        this.mDxItemClickService = iDxItemClickService;
        if (iDxItemClickService != null) {
            if (this.mOnDxClickNavListener == null) {
                this.mOnDxClickNavListener = genNavListener();
            }
            this.mDxItemClickService.addDxClickNavListener(this.mOnDxClickNavListener);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IDxItemClickService.OnDxClickNavListener onDxClickNavListener;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        IDxItemClickService iDxItemClickService = this.mDxItemClickService;
        if (iDxItemClickService != null && (onDxClickNavListener = this.mOnDxClickNavListener) != null) {
            iDxItemClickService.removeDxClickNavListener(onDxClickNavListener);
        }
    }
}
