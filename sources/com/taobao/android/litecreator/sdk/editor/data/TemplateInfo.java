package com.taobao.android.litecreator.sdk.editor.data;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.data.base.EditableBean;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class TemplateInfo extends EditableBean<TemplateInfo> implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String dirPath;
    public String draftPath;
    public String logoUrl;
    public String materialId;
    public String metaJsonPath;
    public String resourceType;
    public int resultHeight;
    public String resultPath;
    public int resultWidth;
    public String singleHolderPath;
    public String templateContent;
    public static String TEMPLATE_FROM_EDIT = "edit";
    public static String TEMPLATE_FROM_ALBUM = "album";
    public int holderCount = 0;
    public String fromPos = TEMPLATE_FROM_ALBUM;
    public boolean isDirty = false;
    public boolean isCloudTransfer = false;
    public boolean isContentDirty = false;

    static {
        t2o.a(511705448);
    }

    public static /* synthetic */ Object ipc$super(TemplateInfo templateInfo, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/sdk/editor/data/TemplateInfo");
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "TemplateInfo{}";
    }
}
