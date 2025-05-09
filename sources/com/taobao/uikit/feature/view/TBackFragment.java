package com.taobao.uikit.feature.view;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.feature.features.ImageSaveFeature;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TBackFragment extends Fragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ImageSaveFeature mImageSaveFeature;

    public static /* synthetic */ Object ipc$super(TBackFragment tBackFragment, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 1257714799) {
            super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/uikit/feature/view/TBackFragment");
        }
    }

    @Override // android.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        ImageSaveFeature imageSaveFeature = this.mImageSaveFeature;
        if (imageSaveFeature != null) {
            imageSaveFeature.onActivityResult(i, i2, intent);
        }
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
        } else {
            super.onCreate(bundle);
        }
    }

    public void setImageSaveFeature(ImageSaveFeature imageSaveFeature) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fba4641f", new Object[]{this, imageSaveFeature});
        } else {
            this.mImageSaveFeature = imageSaveFeature;
        }
    }
}
