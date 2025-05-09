package com.alibaba.ariver.kernel.api.extension.registry;

import com.alibaba.ariver.kernel.api.bytedata.ByteOrderDataUtil;
import com.alibaba.ariver.kernel.api.extension.ExtensionType;
import com.alibaba.ariver.kernel.api.node.Scope;
import com.alibaba.ariver.kernel.common.multiinstance.InstanceType;
import com.alibaba.ariver.kernel.common.multiinstance.MultiInstanceUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.common.utils.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import mtopsdk.common.util.SymbolExpUtil;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ExtensionMetaInfo extends NebulaConfigBase {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public InstanceType f2434a;
    public String bundleName;
    public String extensionClass;
    public List<String> filter;
    public String filterStrs;
    public boolean isLazy;
    public Class<? extends Scope> scope;
    public String scopeClassName;
    public ExtensionType type;
    public String typeString;

    public ExtensionMetaInfo(String str, String str2, String str3, Class<? extends Scope> cls) {
        this(str, str2, str3, cls, true);
    }

    public static /* synthetic */ Object ipc$super(ExtensionMetaInfo extensionMetaInfo, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ariver/kernel/api/extension/registry/ExtensionMetaInfo");
    }

    public final List<String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("69bc7024", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        String replace = str.replace(" ", "");
        if (StringUtils.isEmpty(replace)) {
            return null;
        }
        RVLogger.d("ExtensionMetaInfo", "add event configs " + replace);
        return Arrays.asList(replace.split(SymbolExpUtil.SYMBOL_VERTICALBAR));
    }

    public final Class<? extends Scope> b(String str) {
        String str2;
        Class cls;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("76d22538", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        try {
            if ("App".equalsIgnoreCase(str)) {
                str2 = "com.alibaba.ariver.app.api.App";
            } else if (!"Page".equalsIgnoreCase(str)) {
                return null;
            } else {
                str2 = "com.alibaba.ariver.app.api.Page";
            }
            cls = Class.forName(str2);
        } catch (Throwable th) {
            RVLogger.e("ExtensionMetaInfo", th);
        }
        if (Scope.class.isAssignableFrom(cls)) {
            return cls;
        }
        return null;
    }

    public InstanceType getInstanceType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InstanceType) ipChange.ipc$dispatch("7f0ff538", new Object[]{this});
        }
        if (this.f2434a == null) {
            this.f2434a = MultiInstanceUtils.getDefaultInstanceType();
        }
        return this.f2434a;
    }

    public ExtensionMetaInfo instanceType(InstanceType instanceType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExtensionMetaInfo) ipChange.ipc$dispatch("28d0bd4b", new Object[]{this, instanceType});
        }
        this.f2434a = instanceType;
        return this;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ExtensionMetaInfo{extensionClass=" + this.extensionClass + ",instanceType=" + getInstanceType() + ", filter=" + this.filter + ", type=" + this.typeString + ", instanceType=" + getInstanceType() + '}';
    }

    public ExtensionMetaInfo(String str, String str2, String str3, boolean z) {
        this(str, str2, Collections.singletonList(str3), z);
    }

    @Override // com.alibaba.ariver.kernel.api.extension.registry.NebulaConfigBase
    public ExtensionMetaInfo deserialize(BufferedInputStream bufferedInputStream) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExtensionMetaInfo) ipChange.ipc$dispatch("590f1ee5", new Object[]{this, bufferedInputStream});
        }
        this.mFormatVersion = ByteOrderDataUtil.readByte(bufferedInputStream);
        this.bundleName = ByteOrderDataUtil.readString(bufferedInputStream);
        this.filterStrs = ByteOrderDataUtil.readString(bufferedInputStream);
        this.extensionClass = ByteOrderDataUtil.readString(bufferedInputStream);
        this.isLazy = ByteOrderDataUtil.readBoolean(bufferedInputStream);
        this.scopeClassName = ByteOrderDataUtil.readString(bufferedInputStream);
        this.typeString = ByteOrderDataUtil.readString(bufferedInputStream);
        this.filter = a(this.filterStrs);
        this.scope = b(this.scopeClassName);
        this.type = "normal".equals(this.typeString) ? ExtensionType.NORMAL : ExtensionType.BRIDGE;
        return this;
    }

    @Override // com.alibaba.ariver.kernel.api.extension.registry.NebulaConfigBase
    public ExtensionMetaInfo serialize(BufferedOutputStream bufferedOutputStream) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExtensionMetaInfo) ipChange.ipc$dispatch("d9fd2877", new Object[]{this, bufferedOutputStream});
        }
        ByteOrderDataUtil.writeByte(bufferedOutputStream, this.mFormatVersion);
        ByteOrderDataUtil.writeString(bufferedOutputStream, this.bundleName);
        ByteOrderDataUtil.writeString(bufferedOutputStream, this.filterStrs);
        ByteOrderDataUtil.writeString(bufferedOutputStream, this.extensionClass);
        ByteOrderDataUtil.writeBoolean(bufferedOutputStream, this.isLazy);
        ByteOrderDataUtil.writeString(bufferedOutputStream, this.scopeClassName);
        ByteOrderDataUtil.writeString(bufferedOutputStream, this.typeString);
        return this;
    }

    public ExtensionMetaInfo(String str, String str2, String str3, Class<? extends Scope> cls, boolean z) {
        this(str, str2, Collections.singletonList(str3), cls, z);
    }

    public ExtensionMetaInfo(String str, String str2, List<String> list) {
        this(str, str2, list, true);
    }

    public ExtensionMetaInfo(String str, String str2, List<String> list, Class<? extends Scope> cls) {
        this(str, str2, list, cls, true);
    }

    public ExtensionMetaInfo(String str, String str2, List<String> list, boolean z) {
        this(str, str2, list, (Class<? extends Scope>) null, z);
    }

    public ExtensionMetaInfo(String str, String str2, List<String> list, Class<? extends Scope> cls, boolean z) {
        this(str, str2, list, cls, ExtensionType.NORMAL, z);
    }

    public ExtensionMetaInfo(String str, String str2, List<String> list, Class<? extends Scope> cls, ExtensionType extensionType, boolean z) {
        super((byte) 11);
        this.bundleName = str;
        this.extensionClass = str2;
        this.isLazy = z;
        this.filter = list;
        this.scope = cls;
        this.type = extensionType;
    }

    public ExtensionMetaInfo(String str, String str2, String str3, String str4, String str5, boolean z) {
        super((byte) 11);
        this.scope = null;
        this.bundleName = str;
        this.extensionClass = str2;
        this.isLazy = z;
        this.filterStrs = str3;
        this.scopeClassName = str4;
        this.typeString = str5;
        this.filter = a(str3);
        this.scope = b(str4);
        this.type = "normal".equals(this.typeString) ? ExtensionType.NORMAL : ExtensionType.BRIDGE;
    }
}
