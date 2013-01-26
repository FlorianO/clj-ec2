(ns clj-ec2.core
  (:use propertea.core)
  (:import com.amazonaws.services.ec2.AmazonEC2Client
           com.amazonaws.auth.BasicAWSCredentials
           (com.amazonaws.services.ec2.model S3Storage Storage Address DescribeBundleTasksResult DescribeAddressesResult DescribeAddressesRequest
                                             DescribeAvailabilityZonesResult DescribeAvailabilityZonesRequest DescribeBundleTasksRequest Filter
                                             DescribeConversionTasksResult DescribeConversionTasksRequest ConversionTask
                                             DiskImageDescription DiskImageVolumeDescription CustomerGateway
                                             DescribeCustomerGatewaysResult DescribeCustomerGatewaysRequest
                                             ImportInstanceTaskDetails ImportVolumeTaskDetails Tag ImportInstanceVolumeDetailItem
                                             AvailabilityZoneMessage BundleTask BundleTaskError AvailabilityZone)))


(def endpoints {:us-east-1 "ec2.us-east-1.amazonaws.com"
                :us-west-1 "ec2.us-west-1.amazonaws.com"
                :us-west-2 "ec2.us-west-2.amazonaws.com"
                :eu-west-1 "ec2.eu-west-1.amazonaws.com"
                :ap-southeast-1 "ec2.ap-southeast-1.amazonaws.com"
                :ap-southeast-2 "ec2.ap-southeast-2.amazonaws.com"
                :ap-northeast-1 "ec2.ap-northeast-1.amazonaws.com"
                :sa-east-1 "ec2.sa-east-1.amazonaws.com"})

(defn credentials [] (read-properties (get (System/getenv) "AWS_CREDENTIAL_FILE") :required [:AWSAccessKeyId :AWSSecretKey]))

(defn endpoint []
  (endpoints (keyword (get (System/getenv) "EC2_REGION"))))

(def ^AmazonEC2Client client (delay
                              (doto (AmazonEC2Client. (BasicAWSCredentials. (:AWSAccessKeyId (credentials)) (:AWSSecretKey (credentials))))
                                (.setEndpoint (endpoint)))))

;; void 	activateLicense(ActivateLicenseRequest activateLicenseRequest)

;; AllocateAddressResult 	allocateAddress()
;; AllocateAddressResult 	allocateAddress(AllocateAddressRequest allocateAddressRequest)
;; AssociateAddressResult 	associateAddress(AssociateAddressRequest associateAddressRequest)

;; void 	assignPrivateIpAddresses(AssignPrivateIpAddressesRequest assignPrivateIpAddressesRequest)

;; void 	associateDhcpOptions(AssociateDhcpOptionsRequest associateDhcpOptionsRequest)
;; AssociateRouteTableResult 	associateRouteTable(AssociateRouteTableRequest associateRouteTableRequest)
;; void 	attachInternetGateway(AttachInternetGatewayRequest attachInternetGatewayRequest)
;; AttachNetworkInterfaceResult 	attachNetworkInterface(AttachNetworkInterfaceRequest attachNetworkInterfaceRequest)
;; AttachVolumeResult 	attachVolume(AttachVolumeRequest attachVolumeRequest)

;; AttachVpnGatewayResult 	attachVpnGateway(AttachVpnGatewayRequest attachVpnGatewayRequest)

;; void 	authorizeSecurityGroupEgress(AuthorizeSecurityGroupEgressRequest authorizeSecurityGroupEgressRequest)
;; void 	authorizeSecurityGroupIngress()
;; void 	authorizeSecurityGroupIngress(AuthorizeSecurityGroupIngressRequest authorizeSecurityGroupIngressRequest)

;; BundleInstanceResult 	bundleInstance(BundleInstanceRequest bundleInstanceRequest)

;; CancelBundleTaskResult 	cancelBundleTask(CancelBundleTaskRequest cancelBundleTaskRequest)

;; void 	cancelConversionTask(CancelConversionTaskRequest cancelConversionTaskRequest)

;; void 	cancelExportTask(CancelExportTaskRequest cancelExportTaskRequest)

;; CancelReservedInstancesListingResult 	cancelReservedInstancesListing(CancelReservedInstancesListingRequest cancelReservedInstancesListingRequest)

;; CancelSpotInstanceRequestsResult 	cancelSpotInstanceRequests(CancelSpotInstanceRequestsRequest cancelSpotInstanceRequestsRequest)

;; ConfirmProductInstanceResult 	confirmProductInstance(ConfirmProductInstanceRequest confirmProductInstanceRequest)

;; CopySnapshotResult 	copySnapshot(CopySnapshotRequest copySnapshotRequest)

;; CreateCustomerGatewayResult 	createCustomerGateway(CreateCustomerGatewayRequest createCustomerGatewayRequest)
;; CreateDhcpOptionsResult 	createDhcpOptions(CreateDhcpOptionsRequest createDhcpOptionsRequest)

;; CreateImageResult 	createImage(CreateImageRequest createImageRequest)
;; CreateInstanceExportTaskResult 	createInstanceExportTask(CreateInstanceExportTaskRequest createInstanceExportTaskRequest)
;; CreateInternetGatewayResult 	createInternetGateway()
;; CreateInternetGatewayResult 	createInternetGateway(CreateInternetGatewayRequest createInternetGatewayRequest)
;; CreateKeyPairResult 	createKeyPair(CreateKeyPairRequest createKeyPairRequest)
;; CreateNetworkAclResult 	createNetworkAcl(CreateNetworkAclRequest createNetworkAclRequest)
;; void 	createNetworkAclEntry(CreateNetworkAclEntryRequest createNetworkAclEntryRequest)
;; CreateNetworkInterfaceResult 	createNetworkInterface(CreateNetworkInterfaceRequest createNetworkInterfaceRequest)
;; void 	createPlacementGroup(CreatePlacementGroupRequest createPlacementGroupRequest)
;; CreateReservedInstancesListingResult 	createReservedInstancesListing(CreateReservedInstancesListingRequest createReservedInstancesListingRequest)
;; void 	createRoute(CreateRouteRequest createRouteRequest)
;; CreateRouteTableResult 	createRouteTable(CreateRouteTableRequest createRouteTableRequest)
;; CreateSecurityGroupResult 	createSecurityGroup(CreateSecurityGroupRequest createSecurityGroupRequest)
;; CreateSnapshotResult 	createSnapshot(CreateSnapshotRequest createSnapshotRequest)
;; CreateSpotDatafeedSubscriptionResult 	createSpotDatafeedSubscription(CreateSpotDatafeedSubscriptionRequest createSpotDatafeedSubscriptionRequest)
;; CreateSubnetResult 	createSubnet(CreateSubnetRequest createSubnetRequest)

;; void 	createTags(CreateTagsRequest createTagsRequest)

;; CreateVolumeResult 	createVolume(CreateVolumeRequest createVolumeRequest)

;; CreateVpcResult 	createVpc(CreateVpcRequest createVpcRequest)

;; CreateVpnConnectionResult 	createVpnConnection(CreateVpnConnectionRequest createVpnConnectionRequest)
;; void 	createVpnConnectionRoute(CreateVpnConnectionRouteRequest createVpnConnectionRouteRequest)
;; CreateVpnGatewayResult 	createVpnGateway(CreateVpnGatewayRequest createVpnGatewayRequest)
;; void 	deactivateLicense(DeactivateLicenseRequest deactivateLicenseRequest)
;; void 	deleteCustomerGateway(DeleteCustomerGatewayRequest deleteCustomerGatewayRequest)
;; void 	deleteDhcpOptions(DeleteDhcpOptionsRequest deleteDhcpOptionsRequest)
;; void 	deleteInternetGateway(DeleteInternetGatewayRequest deleteInternetGatewayRequest)
;; void 	deleteKeyPair(DeleteKeyPairRequest deleteKeyPairRequest)
;; void 	deleteNetworkAcl(DeleteNetworkAclRequest deleteNetworkAclRequest)
;; void 	deleteNetworkAclEntry(DeleteNetworkAclEntryRequest deleteNetworkAclEntryRequest)
;; void 	deleteNetworkInterface(DeleteNetworkInterfaceRequest deleteNetworkInterfaceRequest)
;; void 	deletePlacementGroup(DeletePlacementGroupRequest deletePlacementGroupRequest)
;; void 	deleteRoute(DeleteRouteRequest deleteRouteRequest)
;; void 	deleteRouteTable(DeleteRouteTableRequest deleteRouteTableRequest)
;; void 	deleteSecurityGroup()
;; void 	deleteSecurityGroup(DeleteSecurityGroupRequest deleteSecurityGroupRequest)
;; void 	deleteSnapshot(DeleteSnapshotRequest deleteSnapshotRequest)
;; void 	deleteSpotDatafeedSubscription()
;; void 	deleteSpotDatafeedSubscription(DeleteSpotDatafeedSubscriptionRequest deleteSpotDatafeedSubscriptionRequest)
;; void 	deleteSubnet(DeleteSubnetRequest deleteSubnetRequest)
;; void 	deleteTags(DeleteTagsRequest deleteTagsRequest)
;; void 	deleteVolume(DeleteVolumeRequest deleteVolumeRequest)
;; void 	deleteVpc(DeleteVpcRequest deleteVpcRequest)
;; void 	deleteVpnConnection(DeleteVpnConnectionRequest deleteVpnConnectionRequest)
;; void 	deleteVpnConnectionRoute(DeleteVpnConnectionRouteRequest deleteVpnConnectionRouteRequest)
;; void 	deleteVpnGateway(DeleteVpnGatewayRequest deleteVpnGatewayRequest)
;; void 	deregisterImage(DeregisterImageRequest deregisterImageRequest)

(defn filter->map [^Filter filter]
  {:name (.getName filter)
   :values (.getValues filter)})

(defn map->filter [m]
  (doto (Filter.)
    (.setName ^java.lang.String (:name m))
    (.setValues ^java.util.Collection<java.lang.String> (:values m))))

(defn availability-zone-message->map [^AvailabilityZoneMessage azm]
  {:message (.getMessage azm)})

(defn availability-zone->map [^AvailabilityZone az]
  {:messages (map availability-zone-message->map (.getMessages az))
   :region-name (.getRegionName az)
   :state (.getState az)
   :zone-name (.getZoneName az)})

(defn s3-storage->map [^S3Storage storage]
  {:aws-access-key-id (.getAWSAccessKeyId storage)
   :bucket (.getBucket storage)
   :prefix (.getPrefix storage)
   :upload-policy (.getUploadPolicy storage)
   :upload-policy-signature (.getUploadPolicySignature storage)})

(defn storage->map [^Storage storage]
  {:s3-storage (s3-storage->map (.getS3 storage))})

(defn bundle-task-error->map [^BundleTaskError error]
  {:code (.getCode error)
   :message (.getMessage error)})

(defn bundle-task->map [^BundleTask bundle-task]
  {:bundle-id (.getBundleId bundle-task)
   :bundle-task-error (bundle-task-error->map (.getBundleTaskError bundle-task))
   :instance-id (.getInstanceId bundle-task)
   :progress (.getProgress bundle-task)
   :start-time (.getStartTime bundle-task) ;; TODO date
   :state (.getState bundle-task)
   :storage (storage->map (.getStorage bundle-task))
   :update-time (.getUpdateTime bundle-task)}) ;; TODO date

(defn address->map [^Address adr]
  {:allocation-id (.getAllocationId adr)
   :association-id (.getAssociationId adr)
   :domain (.getDomain adr)
   :instance-id (.getInstanceId adr)
   :network-interface-id (.getNetworkInterfaceId adr)
   :network-interface-owner-id (.getNetworkInterfaceOwnerId adr)
   :private-ip (.getPrivateIpAddress adr)
   :public-ip (.getPublicIp adr)})

(defn disk-image-description->map [^DiskImageDescription desc]
  {:checksum (.getChecksum desc)
   :format (.getFormat desc)
   :import-manifest-url (.getImportManifestUrl desc)
   :size (.getSize desc)})

(defn disk-image-volume-description->map [^DiskImageVolumeDescription desc]
  {:id (.getId desc)
   :size (.getSize desc)})

(defn import-instance-volume-detail-item->map [^ImportInstanceVolumeDetailItem item]
  {:availability-zone (.getAvailabilityZone item)
   :bytes-converted (.getBytesConverted item)
   :description (.getDescription item)
   :image (disk-image-description->map (.getImage item))
   :status (.getStatus item)
   :status-message (.getStatusMessage item)
   :volume (disk-image-volume-description->map(.getVolume item))})

(defn import-instance-task-details->map [^ImportInstanceTaskDetails details]
  {:description (.getDescription details)
   :instance-id (.getInstanceId details)
   :platform (.getPlatform details)
   :volumns (map import-instance-volume-detail-item->map (.getVolumes details))})

(defn import-volume-task-details->map [^ImportVolumeTaskDetails details]
  {:availability-zone (.getAvailabilityZone details)
   :bytes-converted (.getBytesConverted details)
   :description (.getDescription details)
   :image (disk-image-description->map (.getImage details))
   :volume (disk-image-volume-description->map (.getVolume details))})

(defn tag->map [^Tag tag]
  {:key (.getKey tag)
   :value (.getValue tag)})

(defn conversion-task->map [^ConversionTask task]
  {:conversion-task-id (.getConversionTaskId task)
   :expiration-time (.getExpirationTime task)
   :import-instance (import-instance-task-details->map (.getImportInstance task))
   :import-volume (import-volume-task-details->map (.getImportVolume task))
   :state (.getState task)
   :status-message (.getStatusMessage task)
   :tags (map tag->map (.getTags task))})

(defn customer-gateway->map [^CustomerGateway gateway]
  {:border-gateway-protocol-autonmous-system-number (.getBgpAsn gateway)
   :customer-gateway-id (.getCustomerGatewayId gateway)
   :ip-address (.getIpAddress gateway)
   :state (.getState gateway)
   :tags (map tag->map (.getTags gateway))
   :type (.getType gateway)})

(defn describe-bundle-tasks-result->map [^DescribeBundleTasksResult res]
  {:bundle-tasks (map bundle-task->map (.getBundleTasks res))})

(defn describe-availability-zones-result->map [^DescribeAvailabilityZonesResult res]
  {:availability-zones (map availability-zone->map (.getAvailabilityZones res))})

(defn describe-addresses-result->map [^DescribeAddressesResult res]
  {:addresses (map address->map (.getAddresses res))})

(defn describe-conversion-tasks-result->map [^DescribeConversionTasksResult res]
  {:conversion-tasks (map conversion-task->map (.getConversionTasks res))})

(defn describe-customer-gateways->map [^DescribeCustomerGatewaysResult res]
  {:customer-gateways (map customer-gateway->map (.getCustomerGateways res))})

;; ------------------

(defn describe-addresses
  ([]
     (describe-addresses-result->map (.describeAddresses @client)))
  ([m]
     (let [dareq (doto (DescribeAddressesRequest.)
                   (.setAllocationIds ^java.util.Collection<java.lang.String> (:allocation-ids m))
                   (.setFilters ^java.util.Collection<Filter> (:filters m))
                   (.setPublicIps ^java.util.Collection<java.lang.String> (:public-ips m)))]
       (describe-addresses-result->map (.describeAddresses @client dareq)))))

(defn describe-availability-zones
  ([]
     (describe-availability-zones-result->map (.describeAvailabilityZones @client)))
  ([m]
     (let [dazreq (doto (DescribeAvailabilityZonesRequest.)
                    (.setFilters ^java.util.Collection<Filter> (map map->filter (:filters m)))
                    (.setZoneNames ^java.util.Collection<String> (:zone-names m)))]
       (describe-availability-zones-result->map (.describeAvailabilityZones @client ^DescribeAvailabilityZonesRequest dazreq)))))

(defn describe-bundle-tasks
  ([]
     (describe-bundle-tasks-result->map (.describeBundleTasks @client)))
  ([m]
     (let [dbtreq (doto (DescribeBundleTasksRequest.)
                    (.setBundleIds ^java.util.Collection<String> (:bundle-ids m))
                    (.setFilters ^java.util.Collection<Filter (:filters m)))]
       (describe-bundle-tasks-result->map (.describeBundleTasks @client dbtreq)))))

(defn describe-conversion-tasks
  ([]
     (describe-conversion-tasks-result->map (.describeConversionTasks @client)))
  ([m]
     (let [dctreq (doto (DescribeConversionTasksRequest.)
                    (.setConversionTaskIds ^java.util.Collection<java.lang.String> (:conversion-task-ids m))
                    (.setFilters ^java.util.Collection<Filter> (map map->filter (:filters m))))]
       (describe-conversion-tasks-result->map (.describeConversionTasks @client dctreq)))))

(defn describe-customer-gateways
  ([]
     (describe-customer-gateways->map (.describeCustomerGateways @client)))
  ([m]
     (let [dcgreq (doto (DescribeCustomerGatewaysRequest.)
                    (.setCustomerGatewayIds ^java.util.Collection<java.lang.String>(:customer-gateway-ids m))
                    (.setFilters ^java.util.Collection<Filter>(:filters m)))]
       (describe-customer-gateways->map (.describeCustomerGateways @client dcgreq)))))


;; DescribeDhcpOptionsResult 	describeDhcpOptions()
;; DescribeDhcpOptionsResult 	describeDhcpOptions(DescribeDhcpOptionsRequest describeDhcpOptionsRequest)

;; DescribeExportTasksResult 	describeExportTasks()
;; DescribeExportTasksResult 	describeExportTasks(DescribeExportTasksRequest describeExportTasksRequest)

;; DescribeImageAttributeResult 	describeImageAttribute(DescribeImageAttributeRequest describeImageAttributeRequest)
;; DescribeImagesResult 	describeImages()
;; DescribeImagesResult 	describeImages(DescribeImagesRequest describeImagesRequest)
;; DescribeInstanceAttributeResult 	describeInstanceAttribute(DescribeInstanceAttributeRequest describeInstanceAttributeRequest)
;; DescribeInstancesResult 	describeInstances()
;; DescribeInstancesResult 	describeInstances(DescribeInstancesRequest describeInstancesRequest)
;; DescribeInstanceStatusResult 	describeInstanceStatus()
;; DescribeInstanceStatusResult 	describeInstanceStatus(DescribeInstanceStatusRequest describeInstanceStatusRequest)
;; DescribeInternetGatewaysResult 	describeInternetGateways()
;; DescribeInternetGatewaysResult 	describeInternetGateways(DescribeInternetGatewaysRequest describeInternetGatewaysRequest)
;; DescribeKeyPairsResult 	describeKeyPairs()
;; DescribeKeyPairsResult 	describeKeyPairs(DescribeKeyPairsRequest describeKeyPairsRequest)
;; DescribeLicensesResult 	describeLicenses()
;; DescribeLicensesResult 	describeLicenses(DescribeLicensesRequest describeLicensesRequest)
;; DescribeNetworkAclsResult 	describeNetworkAcls()
;; DescribeNetworkAclsResult 	describeNetworkAcls(DescribeNetworkAclsRequest describeNetworkAclsRequest)
;; DescribeNetworkInterfaceAttributeResult 	describeNetworkInterfaceAttribute(DescribeNetworkInterfaceAttributeRequest describeNetworkInterfaceAttributeRequest)
;; DescribeNetworkInterfacesResult 	describeNetworkInterfaces()
;; DescribeNetworkInterfacesResult 	describeNetworkInterfaces(DescribeNetworkInterfacesRequest describeNetworkInterfacesRequest)
;; DescribePlacementGroupsResult 	describePlacementGroups()
;; DescribePlacementGroupsResult 	describePlacementGroups(DescribePlacementGroupsRequest describePlacementGroupsRequest)
;; DescribeRegionsResult 	describeRegions()
;; DescribeRegionsResult 	describeRegions(DescribeRegionsRequest describeRegionsRequest)
;; DescribeReservedInstancesResult 	describeReservedInstances()
;; DescribeReservedInstancesResult 	describeReservedInstances(DescribeReservedInstancesRequest describeReservedInstancesRequest)
;; DescribeReservedInstancesListingsResult 	describeReservedInstancesListings()
;; DescribeReservedInstancesListingsResult 	describeReservedInstancesListings(DescribeReservedInstancesListingsRequest describeReservedInstancesListingsRequest)
;; DescribeReservedInstancesOfferingsResult 	describeReservedInstancesOfferings()
;; DescribeReservedInstancesOfferingsResult 	describeReservedInstancesOfferings(DescribeReservedInstancesOfferingsRequest describeReservedInstancesOfferingsRequest)
;; DescribeRouteTablesResult 	describeRouteTables()
;; DescribeRouteTablesResult 	describeRouteTables(DescribeRouteTablesRequest describeRouteTablesRequest)
;; DescribeSecurityGroupsResult 	describeSecurityGroups()
;; DescribeSecurityGroupsResult 	describeSecurityGroups(DescribeSecurityGroupsRequest describeSecurityGroupsRequest)
;; DescribeSnapshotAttributeResult 	describeSnapshotAttribute(DescribeSnapshotAttributeRequest describeSnapshotAttributeRequest)
;; DescribeSnapshotsResult 	describeSnapshots()
;; DescribeSnapshotsResult 	describeSnapshots(DescribeSnapshotsRequest describeSnapshotsRequest)
;; DescribeSpotDatafeedSubscriptionResult 	describeSpotDatafeedSubscription()
;; DescribeSpotDatafeedSubscriptionResult 	describeSpotDatafeedSubscription(DescribeSpotDatafeedSubscriptionRequest describeSpotDatafeedSubscriptionRequest)
;; DescribeSpotInstanceRequestsResult 	describeSpotInstanceRequests()
;; DescribeSpotInstanceRequestsResult 	describeSpotInstanceRequests(DescribeSpotInstanceRequestsRequest describeSpotInstanceRequestsRequest)
;; DescribeSpotPriceHistoryResult 	describeSpotPriceHistory()
;; DescribeSpotPriceHistoryResult 	describeSpotPriceHistory(DescribeSpotPriceHistoryRequest describeSpotPriceHistoryRequest)
;; DescribeSubnetsResult 	describeSubnets()
;; DescribeSubnetsResult 	describeSubnets(DescribeSubnetsRequest describeSubnetsRequest)
;; DescribeTagsResult 	describeTags()
;; DescribeTagsResult 	describeTags(DescribeTagsRequest describeTagsRequest)
;; DescribeVolumeAttributeResult 	describeVolumeAttribute(DescribeVolumeAttributeRequest describeVolumeAttributeRequest)
;; DescribeVolumesResult 	describeVolumes()
;; DescribeVolumesResult 	describeVolumes(DescribeVolumesRequest describeVolumesRequest)
;; DescribeVolumeStatusResult 	describeVolumeStatus()
;; DescribeVolumeStatusResult 	describeVolumeStatus(DescribeVolumeStatusRequest describeVolumeStatusRequest)
;; DescribeVpcsResult 	describeVpcs()
;; DescribeVpcsResult 	describeVpcs(DescribeVpcsRequest describeVpcsRequest)
;; DescribeVpnConnectionsResult 	describeVpnConnections()
;; DescribeVpnConnectionsResult 	describeVpnConnections(DescribeVpnConnectionsRequest describeVpnConnectionsRequest)
;; DescribeVpnGatewaysResult 	describeVpnGateways()
;; DescribeVpnGatewaysResult 	describeVpnGateways(DescribeVpnGatewaysRequest describeVpnGatewaysRequest)
;; void 	detachInternetGateway(DetachInternetGatewayRequest detachInternetGatewayRequest)
;; void 	detachNetworkInterface(DetachNetworkInterfaceRequest detachNetworkInterfaceRequest)
;; DetachVolumeResult 	detachVolume(DetachVolumeRequest detachVolumeRequest)
;; void 	detachVpnGateway(DetachVpnGatewayRequest detachVpnGatewayRequest)
;; void 	disableVgwRoutePropagation(DisableVgwRoutePropagationRequest disableVgwRoutePropagationRequest)
;; void 	disassociateAddress(DisassociateAddressRequest disassociateAddressRequest)
;; void 	disassociateRouteTable(DisassociateRouteTableRequest disassociateRouteTableRequest)
;; void 	enableVgwRoutePropagation(EnableVgwRoutePropagationRequest enableVgwRoutePropagationRequest)
;; void 	enableVolumeIO(EnableVolumeIORequest enableVolumeIORequest)
;; ResponseMetadata 	getCachedResponseMetadata(AmazonWebServiceRequest request)
;; GetConsoleOutputResult 	getConsoleOutput(GetConsoleOutputRequest getConsoleOutputRequest)
;; GetPasswordDataResult 	getPasswordData(GetPasswordDataRequest getPasswordDataRequest)
;; ImportInstanceResult 	importInstance(ImportInstanceRequest importInstanceRequest)
;; ImportKeyPairResult 	importKeyPair(ImportKeyPairRequest importKeyPairRequest)
;; ImportVolumeResult 	importVolume()
;; ImportVolumeResult 	importVolume(ImportVolumeRequest importVolumeRequest)
;; void 	modifyImageAttribute(ModifyImageAttributeRequest modifyImageAttributeRequest)
;; void 	modifyInstanceAttribute(ModifyInstanceAttributeRequest modifyInstanceAttributeRequest)
;; void 	modifyNetworkInterfaceAttribute(ModifyNetworkInterfaceAttributeRequest modifyNetworkInterfaceAttributeRequest)
;; void 	modifySnapshotAttribute(ModifySnapshotAttributeRequest modifySnapshotAttributeRequest)
;; void 	modifyVolumeAttribute(ModifyVolumeAttributeRequest modifyVolumeAttributeRequest)
;; MonitorInstancesResult 	monitorInstances(MonitorInstancesRequest monitorInstancesRequest)
;; PurchaseReservedInstancesOfferingResult 	purchaseReservedInstancesOffering(PurchaseReservedInstancesOfferingRequest purchaseReservedInstancesOfferingRequest)
;; void 	rebootInstances(RebootInstancesRequest rebootInstancesRequest)
;; RegisterImageResult 	registerImage()
;; RegisterImageResult 	registerImage(RegisterImageRequest registerImageRequest)
;; void 	releaseAddress()
;; void 	releaseAddress(ReleaseAddressRequest releaseAddressRequest)
;; ReplaceNetworkAclAssociationResult 	replaceNetworkAclAssociation(ReplaceNetworkAclAssociationRequest replaceNetworkAclAssociationRequest)
;; void 	replaceNetworkAclEntry(ReplaceNetworkAclEntryRequest replaceNetworkAclEntryRequest)
;; void 	replaceRoute(ReplaceRouteRequest replaceRouteRequest)
;; ReplaceRouteTableAssociationResult 	replaceRouteTableAssociation(ReplaceRouteTableAssociationRequest replaceRouteTableAssociationRequest)
;; void 	reportInstanceStatus()
;; void 	reportInstanceStatus(ReportInstanceStatusRequest reportInstanceStatusRequest)
;; RequestSpotInstancesResult 	requestSpotInstances(RequestSpotInstancesRequest requestSpotInstancesRequest)
;; void 	resetImageAttribute(ResetImageAttributeRequest resetImageAttributeRequest)
;; void 	resetInstanceAttribute(ResetInstanceAttributeRequest resetInstanceAttributeRequest)
;; void 	resetNetworkInterfaceAttribute(ResetNetworkInterfaceAttributeRequest resetNetworkInterfaceAttributeRequest)
;; void 	resetSnapshotAttribute(ResetSnapshotAttributeRequest resetSnapshotAttributeRequest)
;; void 	revokeSecurityGroupEgress(RevokeSecurityGroupEgressRequest revokeSecurityGroupEgressRequest)
;; void 	revokeSecurityGroupIngress()
;; void 	revokeSecurityGroupIngress(RevokeSecurityGroupIngressRequest revokeSecurityGroupIngressRequest)
;; RunInstancesResult 	runInstances(RunInstancesRequest runInstancesRequest)
;; void 	setEndpoint(java.lang.String endpoint)
;; void 	shutdown()
;; StartInstancesResult 	startInstances(StartInstancesRequest startInstancesRequest)
;; StopInstancesResult 	stopInstances(StopInstancesRequest stopInstancesRequest)
;; TerminateInstancesResult 	terminateInstances(TerminateInstancesRequest terminateInstancesRequest)
;; void 	unassignPrivateIpAddresses(UnassignPrivateIpAddressesRequest unassignPrivateIpAddressesRequest)
;; UnmonitorInstancesResult 	unmonitorInstances(UnmonitorInstancesRequest unmonitorInstancesRequest)
