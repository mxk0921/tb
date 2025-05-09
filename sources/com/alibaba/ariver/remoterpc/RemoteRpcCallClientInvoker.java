package com.alibaba.ariver.remoterpc;

import android.os.Parcel;
import android.util.Log;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.ipc.RVRemoteCallerProxy;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alipay.mobile.common.rpc.RpcException;
import com.alipay.mobile.common.rpc.RpcFactory;
import com.alipay.mobile.common.rpc.RpcInvoker;
import com.alipay.mobile.common.rpc.protocol.Serializer;
import com.alipay.mobile.common.rpc.protocol.util.RPCProtoDesc;
import com.alipay.mobile.common.rpc.transport.InnerRpcInvokeContext;
import com.alipay.mobile.common.rpc.util.RpcInvokerUtil;
import com.alipay.mobile.common.transport.ext.ProtobufCodecImpl;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class RemoteRpcCallClientInvoker extends RpcInvoker {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public RemoteRpcCallClientInvoker(RpcFactory rpcFactory) {
        super(rpcFactory);
    }

    public static /* synthetic */ Object ipc$super(RemoteRpcCallClientInvoker remoteRpcCallClientInvoker, String str, Object... objArr) {
        if (str.hashCode() == -2138168410) {
            return super.invoke(objArr[0], (Class) objArr[1], (Method) objArr[2], (Object[]) objArr[3], (InnerRpcInvokeContext) objArr[4]);
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ariver/remoterpc/RemoteRpcCallClientInvoker");
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvoker
    public Object invoke(Object obj, Class<?> cls, Method method, Object[] objArr, InnerRpcInvokeContext innerRpcInvokeContext) throws RpcException {
        IRpcCaller iRpcCaller;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("808e23a6", new Object[]{this, obj, cls, method, objArr, innerRpcInvokeContext});
        }
        if (ProcessUtils.isMainProcess()) {
            RVLogger.d("AriverRpc:RemoteRpcCallClientInvoker", "RemoteRpcCallClientInvoker isMainProcess! " + ProcessUtils.getProcessName());
            return super.invoke(obj, cls, method, objArr, innerRpcInvokeContext);
        }
        RVLogger.d("AriverRpc:RemoteRpcCallClientInvoker", "RemoteRpcCallClientInvoker invoke begin " + Arrays.toString(objArr));
        int incrementAndGet = this.rpcSequence.incrementAndGet();
        RPCProtoDesc rPCProtoDesc = new RPCProtoDesc();
        Serializer serializer = this.serializerFactory.getSerializer(incrementAndGet, RpcInvokerUtil.getOperationTypeValue(method, objArr), method, objArr, getScene(), innerRpcInvokeContext, rPCProtoDesc);
        ThreadLocal<Map<String, Object>> threadLocal = RpcInvoker.EXT_PARAM;
        if (threadLocal.get() != null) {
            serializer.setExtParam(threadLocal.get());
        }
        byte[] j = j(objArr, rPCProtoDesc);
        Object obj2 = null;
        try {
            iRpcCaller = (IRpcCaller) ((RVRemoteCallerProxy) RVProxy.get(RVRemoteCallerProxy.class)).getRemoteCaller(IRpcCaller.class);
        } catch (RemoteRpcException e) {
            throw e;
        } catch (Throwable th) {
            RVLogger.e("AriverRpc:RemoteRpcCallClientInvoker", "RemoteRpcCallClientInvoker invoke error " + Log.getStackTraceString(th));
        }
        if (iRpcCaller == null) {
            return null;
        }
        RpcCallArgs rpcCallArgs = new RpcCallArgs();
        rpcCallArgs.className = cls.getName();
        rpcCallArgs.methodName = method.toGenericString();
        rpcCallArgs.argsBody = j;
        rpcCallArgs.protoType = rPCProtoDesc.protoType;
        rpcCallArgs.invokeContext = new RemoteRpcInvokeContext(innerRpcInvokeContext);
        RVLogger.d("AriverRpc:RemoteRpcCallClientInvoker", "RemoteRpcCallClientInvoker call begin " + Arrays.toString(objArr));
        RpcCallRet call = iRpcCaller.call(rpcCallArgs);
        RVLogger.d("AriverRpc:RemoteRpcCallClientInvoker", "RemoteRpcCallClientInvoker call end " + call);
        if (call.isException) {
            RemoteRpcException unpacketException = unpacketException(call.data);
            if (unpacketException != null) {
                throw unpacketException;
            }
        } else {
            obj2 = unpacketRet(method, call.data, rPCProtoDesc);
            unpacketInnerRpcInvokeContext(innerRpcInvokeContext, call.invokeContext);
        }
        RVLogger.d("AriverRpc:RemoteRpcCallClientInvoker", "RemoteRpcCallClientInvoker invoke end " + Arrays.toString(objArr));
        return obj2;
    }

    public void unpacketInnerRpcInvokeContext(InnerRpcInvokeContext innerRpcInvokeContext, RemoteRpcInvokeContext remoteRpcInvokeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5defeb83", new Object[]{this, innerRpcInvokeContext, remoteRpcInvokeContext});
        } else if (innerRpcInvokeContext != null && remoteRpcInvokeContext != null) {
            innerRpcInvokeContext.setAppId(remoteRpcInvokeContext.appId);
            innerRpcInvokeContext.timeout = remoteRpcInvokeContext.timeout;
            innerRpcInvokeContext.setGwUrl(remoteRpcInvokeContext.gwUrl);
            innerRpcInvokeContext.requestHeaders = remoteRpcInvokeContext.requestHeaders;
            innerRpcInvokeContext.compress = remoteRpcInvokeContext.compress;
            innerRpcInvokeContext.setAppKey(remoteRpcInvokeContext.appKey);
            innerRpcInvokeContext.resetCookie = remoteRpcInvokeContext.resetCookie;
            innerRpcInvokeContext.bgRpc = remoteRpcInvokeContext.bgRpc;
            innerRpcInvokeContext.responseHeader = remoteRpcInvokeContext.responseHeader;
            innerRpcInvokeContext.allowRetry = remoteRpcInvokeContext.allowRetry;
            innerRpcInvokeContext.isUrgent = remoteRpcInvokeContext.isUrgent;
            innerRpcInvokeContext.isRpcV2 = remoteRpcInvokeContext.isRpcV2;
            innerRpcInvokeContext.allowBgLogin = remoteRpcInvokeContext.allowBgLogin;
            innerRpcInvokeContext.allowNonNet = remoteRpcInvokeContext.allowNonNet;
            innerRpcInvokeContext.setWorkspaceId(remoteRpcInvokeContext.workspaceId);
            innerRpcInvokeContext.protocolVersion = remoteRpcInvokeContext.protocolVersion;
            innerRpcInvokeContext.isCustGwUrl = remoteRpcInvokeContext.isCustGwUrl;
        }
    }

    public Object unpacketRet(Method method, byte[] bArr, RPCProtoDesc rPCProtoDesc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("9912d589", new Object[]{this, method, bArr, rPCProtoDesc});
        }
        Type genericReturnType = method.getGenericReturnType();
        Class<?> returnType = method.getReturnType();
        if (rPCProtoDesc.isJsonV2() || rPCProtoDesc.isJsonV1() || rPCProtoDesc.isSimpleJsonV1()) {
            return JSON.parseObject(EncodingUtils.getString(bArr, "UTF-8"), genericReturnType, new Feature[0]);
        }
        if (!rPCProtoDesc.isPBV1() && !rPCProtoDesc.isSimplePBV1()) {
            return null;
        }
        if (genericReturnType instanceof GenericArrayType) {
            return bArr;
        }
        return new ProtobufCodecImpl().deserialize(returnType, bArr);
    }

    /* JADX WARN: Finally extract failed */
    public RemoteRpcException unpacketException(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RemoteRpcException) ipChange.ipc$dispatch("af41726a", new Object[]{this, bArr});
        }
        Parcel obtain = Parcel.obtain();
        try {
            try {
                obtain.unmarshall(bArr, 0, bArr.length);
                obtain.setDataPosition(0);
                RemoteRpcException remoteRpcException = (RemoteRpcException) obtain.readValue(RemoteRpcException.class.getClassLoader());
                obtain.recycle();
                return remoteRpcException;
            } catch (Exception e) {
                RVLogger.e("AriverRpc:RemoteRpcCallClientInvoker", "unpacketException error " + Log.getStackTraceString(e));
                obtain.recycle();
                return null;
            }
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    public final byte[] j(Object[] objArr, RPCProtoDesc rPCProtoDesc) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("d91fea23", new Object[]{this, objArr, rPCProtoDesc});
        }
        if (rPCProtoDesc.isJsonV2() || rPCProtoDesc.isJsonV1() || rPCProtoDesc.isSimpleJsonV1() || rPCProtoDesc.isSimplePBV1()) {
            if (objArr == null) {
                str = MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264;
            } else {
                str = JSON.toJSONString(objArr, SerializerFeature.DisableCircularReferenceDetect);
            }
            try {
                return str.getBytes("UTF-8");
            } catch (UnsupportedEncodingException e) {
                RVLogger.e("AriverRpc:RemoteRpcCallClientInvoker", "packetArgs error " + Log.getStackTraceString(e));
                return null;
            }
        } else if (objArr == null || !rPCProtoDesc.isPBV1()) {
            return null;
        } else {
            return new ProtobufCodecImpl().serialize(objArr[0]);
        }
    }
}
