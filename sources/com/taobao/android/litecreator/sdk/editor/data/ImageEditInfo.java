package com.taobao.android.litecreator.sdk.editor.data;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.AbsEditInfo;
import com.taobao.android.litecreator.sdk.editor.data.base.Beauty;
import java.io.Serializable;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ImageEditInfo extends AbsEditInfo implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int V1 = 0;
    public static final int V2 = 1;
    public Adjust adjust;
    public AiQuality aiQuality;
    public Beauty beauty;
    public Crop crop;
    public Filter filter;
    public List<RichLabel> labels;
    public Music music;
    public List<Paster> pasters;
    public TemplateInfo templateInfo;
    public int version = 1;
    public Volume volume;

    static {
        t2o.a(511705427);
    }

    public static /* synthetic */ Object ipc$super(ImageEditInfo imageEditInfo, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/sdk/editor/data/ImageEditInfo");
    }

    public boolean cropOnly() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99c77ce7", new Object[]{this})).booleanValue();
        }
        if (this.filter != null || this.aiQuality != null) {
            return false;
        }
        List<Paster> list = this.pasters;
        if ((list == null || list.size() <= 0) && this.beauty == null && this.adjust == null && this.templateInfo == null) {
            return true;
        }
        return false;
    }

    public boolean isEditedForCanExitDirectly() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("792f4339", new Object[]{this})).booleanValue();
        }
        if (this.filter != null) {
            return false;
        }
        List<Paster> list = this.pasters;
        if ((list == null || list.size() <= 0) && this.labels == null && this.beauty == null && this.adjust == null && this.templateInfo == null) {
            return true;
        }
        return false;
    }

    public boolean noneEdit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b75238ed", new Object[]{this})).booleanValue();
        }
        if (this.filter != null || this.crop != null || this.aiQuality != null) {
            return false;
        }
        List<Paster> list = this.pasters;
        if ((list == null || list.size() <= 0) && this.beauty == null && this.adjust == null && this.templateInfo == null) {
            return true;
        }
        return false;
    }

    public boolean noneEditOnlyTemplate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("394e4b53", new Object[]{this})).booleanValue();
        }
        if (this.filter != null || this.crop != null || this.aiQuality != null) {
            return false;
        }
        List<Paster> list = this.pasters;
        if ((list == null || list.size() <= 0) && this.beauty == null && this.adjust == null) {
            return true;
        }
        return false;
    }
}
